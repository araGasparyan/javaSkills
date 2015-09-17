package linesfrominternet;

import java.awt.*;
import java.applet.Applet;
import java.util.Vector;


public class Lines extends Applet implements Runnable {

private Point path[];
private Rectangle layout[], over;
private Ball matrix[][], active, delayed, nextBall[];
private Color next[];
private boolean debug, blocked;
private int score, runner_mode, update_mode, path_index;
private Font score_font;
private Thread runner;
private Vector deathRow;


public void init() {
   resize(360, 400);
   setLayout(null);
   debug = true;
   score_font = new Font("Helvetica", Font.BOLD, 20);
   layout = new Rectangle[7];
   setLayout();
   Button restart = new Button("Restart");
   restart.setFont(score_font);
   add(restart);
   restart.reshape(layout[0].x, layout[0].y, layout[0].width, layout[0].height);
   startGame();   
}

private void startGame() {
   blocked = false;
   runner_mode = 0;
   update_mode = 0;
   score = 0;
   matrix = new Ball[9][9];
   setNextColors();
   for(int i=0; i<2; i++) {
      placeNextBalls();
      setNextColors();
   }
   repaint();
}

//------------------------------------------------
public boolean action(Event evt, Object what) {
   if(evt.target instanceof Button) startGame();
   return super.action(evt, what);
}


public boolean mouseDown(Event evt, int x, int y) {
   if(blocked) return true;

   if(layout[3].inside(x,y)) {
      Point p = convertToMatrix(x,y);
      if(!emptySlot(p.x,p.y)) {
         if(active == null)             startJumping(p.x, p.y);
         else if(active.x == p.x && active.y == p.y)  endJumping();
         else { endJumping(); startJumping(p.x, p.y); }
      }
      else {
         if(active != null) startRunning(p);
      }
   }
   return true;
}

private void resumeWaiting() {
   runner_mode = 20;
   update_mode = 20;
   active = null;
   blocked = false;
}


private void startJumping(int x, int y) {
   dbi("start jumping");
   active = new Ball(x, y, getColor(x,y));
   active.jumping = true;
   runner_mode = 1;
   update_mode = 1;   
}

private void endJumping() {
   dbi("end jumping");
   runner_mode = 0;
   update_mode = 0;
   active.jumping = false;
   redrawActive();
   active  = null;
}

private void startRunning(Point to) {
   PathFinder pf = new PathFinder(active, to, BallsToInts());
   path = pf.getPath();
   if(path != null) {
      dbi("------------------");
      dbi("start running");
      blocked = true;
      active.jumping = false;
      active = matrix[path[0].x][path[0].y];
      matrix[path[0].x][path[0].y] = null;
      path_index = 1;
      runner_mode = 2;
      update_mode = 2;
   }
}

private void endRunning() {
   dbi("end running");
   matrix[active.x][active.y] = active;
   path = null;
   path_index = 1;
   runner_mode = 0;
   update_mode = 0;
   checkForFive(); // active is alive
}


private void checkForFive() {
   dbi("check for five");
   if(markFive(active)) {
      int extra = deathRow.size() - 5;
      score += (extra==0) ? 10 : 10+(int)Math.pow(2, extra); 
      startDeletion();
   }
   else startAddingNext();
}

private void startDeletion() {
   dbi("start deletion");
   update_mode = 3;
   runner_mode = 3;
}   

private void endDeletion() {
   dbi("end deletion");
   resumeWaiting();
}


private void startAddingNext() {
   dbi("start adding next");
   placeNextBalls();   
   setNextColors();
   update_mode = 4;
   runner_mode = 4;
}

private void endAddingNext() {
   runner_mode = 0;
   boolean b = false;
   for(int i=0; i<nextBall.length; i++) {
      b = b || markFive(nextBall[i].getPoint());
   }
   if(b) startDeletion();
   else resumeWaiting();
   dbi("end adding next");
}
//------------------------------------------------
public void start() {
   runner = new Thread(this);
   runner.setPriority(Thread.MIN_PRIORITY);
   runner.start();
}


public void stop() {
   if(runner!=null) runner.stop();
   runner = null;
}


public void run() {
   while(true) {
      switch(runner_mode) {
         case 0:  pause(20); break;
         case 1:  // jumping
            repaint();
            pause(250);
            break;
         case 2:   // running
            if(path_index == path.length) endRunning();
            else repaint();
            pause(100);
            break;
         case 3:  // deletion
            if(((Ball)deathRow.elementAt(0)).radius < 0) endDeletion();
            else repaint();
            pause(20);
            break;
         case 4:
            if(nextBall[0].radius1 > 14) endAddingNext();
            else repaint();
            pause(20);
            break;
         case 20:
            repaint();
            pause(20);
            break;
      }
   }
}


private void pause(int time) {
   try { runner.sleep(time); }
   catch(InterruptedException e) { dbi(""+e); }				
}

								
//--------------------------------------------------------
public void paint(Graphics g) {
   update(g);  
}


public void update(Graphics g) {
   switch(update_mode) {
      case 0:
         displayLayout(g);
         drawMatrix(g);
         drawCurrentScore(g);
         drawNextColors(g);
         break;
      case 1:
         active.redraw(g);
         break;
      case 2:
         moveBall(g);
         break;
      case 3:
         shrinkDeathRow(g);
         break;
      case 4:
         growNextBall(g);
         break;
      case 10:
         drawCurrentScore(g);
         break;
      case 20:
         drawCurrentScore(g);
         drawNextColors(g);
         runner_mode = 0;
         update_mode = 0;
         break;
   }
}


private void moveBall(Graphics g) {
   int i = path_index;
   active.erase(g);
   active = new Ball(path[i].x, path[i].y, active.color);
   active.draw(g);
   path_index++;
}

private void shrinkDeathRow(Graphics g) {
   Ball ball;
   for(int i=0; i<deathRow.size(); i++) {
       ball = (Ball)deathRow.elementAt(i);
       ball.decrement(g);
   }
}

private void growNextBall(Graphics g) {
   for(int i=0; i<nextBall.length; i++) {
      nextBall[i].increment(g);
   }
}

private void redrawActive() {
   Graphics g = getGraphics();
   active.redraw(g);
   g.dispose();
}

private void eraseActive() {
   Graphics g = getGraphics();
 //  active.erase(g);
   g.dispose();
}

//----------------------------------------------
private boolean emptySlot(int x, int y) {
   if(matrix[x][y] == null) return true;
   return false;
}


private Point convertToMatrix(int x, int y) {
   if(layout[3].inside(x,y)) {
      x = x - layout[3].x; x /= 40;
      y = y - layout[3].y; y /= 40;
      return new Point(x,y);
   }
   return null;
}   


private int[][] BallsToInts() {
   int imatrix[][] = new int[9][9];
   for(int x=0; x<9; x++) {
      for(int y=0; y<9; y++) {
         imatrix[x][y] = (matrix[x][y]==null) ? 0 : 1;
      }
   }
   return imatrix;
}

private int getNextNumber() {
   int number = 0;
   for(int x=0; x<9; x++) {
      for(int y=0; y<9; y++) {
         if(matrix[x][y] == null) number++;
      }
   }
   return (number > 3) ? 3 : number;
}


private boolean markFive(Point p) {
   deathRow = null;
   markSlots(p,1,0);
   markSlots(p,0,1);
   markSlots(p,1,1);
   markSlots(p,1,-1);
   if(deathRow != null) {
      initDeathRow();
      return true;
   }
   return false;
}



private void initDeathRow() {
   for(int x=0; x<9; x++) {
      for(int y=0; y<9; y++) {
         if(matrix[x][y] != null && !matrix[x][y].alive) {
            deathRow.addElement(matrix[x][y]);
            matrix[x][y] = null;
         }
      }
   }
}

private Color getColor(int x, int y) {
   if(matrix[x][y] != null) return matrix[x][y].color;
   return null;
}

private void markSlots(Point p, int dx, int dy) {
   int side1 = 0, side2 = 0;
   int x = p.x+dx, y = p.y+dy;
   Color color = getColor(p.x,p.y);

   while(x<=8 && y<=8 && x>=0 && y>=0 && getColor(x,y)==color) {
     side1++; x+=dx; y+=dy;
   }

   x = p.x-dx;
   y = p.y-dy;
   while(x>=0 && y>=0 && x<=8 && y<=8 && getColor(x,y)==color) {
     side2++; x-=dx; y-=dy;
   }

   int length = side1 + side2 + 1;
   if(length > 4) {
      x = p.x + side1*dx;
      y = p.y + side1*dy;
      for(int i=0; i<length; i++) {
         matrix[x][y].alive = false;
         x -= dx; y -= dy;
      }
      deathRow = new Vector();
   }
}


//-------------------------------------------------
private void setNextColors() {
   int random=0;
   next = new Color[getNextNumber()];
   for(int i=0; i<next.length; i++) {
      random = (int)(Settings.colors.length * Math.random());
      next[i] = Settings.colors[random];
   }
}


private void placeNextBalls() {
   int x, y;
   Ball ball;
   nextBall = new Ball[next.length];
   for(int i=0; i<next.length; i++) {
      if(next[i]==null) continue;
      do {
         x = (int)(9 * Math.random());
         y = (int)(9 * Math.random());
      }
      while(matrix[x][y] != null); 
      ball = new Ball(x,y,next[i]);
      matrix[x][y] = ball;
      nextBall[i] = ball;
   }
}



//--------------------------------------------------------
private void drawCurrentScore(Graphics g) {
   Rectangle r = layout[2];
   g.setFont(score_font);
   FontMetrics fm = g.getFontMetrics(score_font);
   String string = ""+ score;
   g.setColor(Color.black);
   g.fillRect(r.x, r.y, r.width, r.height);
   g.setColor(Color.lightGray);
   g.drawRect(r.x, r.y, r.width, r.height);
   g.setColor(Color.green);
   g.drawString(string, r.x+r.width-fm.stringWidth(string)-5, r.y+r.height-5);
}


private void drawNextColors(Graphics g) {
   Rectangle r = layout[1];
   for(int i=0; i<next.length; i++) {
      g.setColor(Color.lightGray);
      g.fill3DRect(r.x+i*30, r.y, 30, 30, true);
      if(next[i] == null) continue;
      g.setColor(next[i]);
      g.fillOval(r.x+i*30+4, r.y+4, 22, 22);  
      g.setColor(Color.black);
      g.drawOval(r.x+i*30+4, r.y+4, 22, 22);
   }
}


private void drawMatrix(Graphics g) {
   int x = layout[3].x;
   int y = layout[3].y;
   int side = 40;
   Ball ball;
   for(int i=0; i<9; i++) {
      for(int k=0; k<9; k++) {
         g.setColor(Color.lightGray);
         for(int j=0; j<3; j++) {
            g.fill3DRect(x+i*side+j*1, y+k*side+j*1, side-j*2, side-j*2, true);
         }
         ball = matrix[i][k];
         if(ball!=null) { ball.draw(g);}
      }
   }
}


private void displayLayout(Graphics g) {
   g.setColor(Color.lightGray);
   for(int i=0; i<layout.length; i++) {
      g.fill3DRect(layout[i].x, layout[i].y, layout[i].width, layout[i].height, true);
   }
}


private void setLayout() {
   layout = new Rectangle[4];
   layout[0] = new Rectangle(5, 5, 80, 30);
   layout[1] = new Rectangle(135, 5, 90, 30);
   layout[2] = new Rectangle(275, 5, 80, 30);
   layout[3] = new Rectangle(0, 40, 360, 360);
}


private void dbi(String s) {
   if(debug) System.out.println(s);
}

}
