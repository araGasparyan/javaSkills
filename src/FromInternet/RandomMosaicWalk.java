/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FromInternet;

public class RandomMosaicWalk {

   /*
      This program shows a window full of randomly colored
      squares.  A "disturbance" moves randomly around
      in the window, randomly changing the color of
      each square that it visits.  The program runs
      until the user closes the window.
   */
       
   static int currentRow; // row currently containing the disturbance
   static int currentColumn; // column currently containing disturbance
           
   public static void main(String[] args) {
          // Main program creates the window, fills it with
          // random colors, then moves the disturbance in
          // a random walk around the window.
       Mosaic.open(10,20,10,10);
       fillWithRandomColors();
       currentRow = 5;   // start at center of window
       currentColumn = 10;
       while (Mosaic.isOpen()) {
           changeToRandomColor(currentRow, currentColumn);
           randomMove();
           Mosaic.delay(20);
       }
   }  // end of main()
   
   static void fillWithRandomColors() {
           // fill every square, in each row and column,
           // with a random color
        for (int row=0; row < 10; row++) {
           for (int column=0; column < 20; column++) {
               changeToRandomColor(row, column);  
           }
        }
   }  // end of fillWithRandomColors()
   
   static void changeToRandomColor(int rowNum, int colNum) {
           // change the square in row number rowNum and
           // column number colNum to a random color.
        int red = (int)(256*Math.random());    // choose random levels in range
        int green = (int)(256*Math.random());  //     0 to 255 for red, green, 
        int blue = (int)(256*Math.random());   //     and blue color components
        Mosaic.setColor(rowNum,colNum,red,green,blue);  
    }  // end of changeToRandomColor()
    
    static void randomMove() {
           // Randomly move the disturbance in one of
           // four possible directions: up, down, left, or right;
           // if this moves the disturbance outside the window,
           // then move it to the opposite edge of the window.
        int directionNum; // Randomly set to 0, 1, 2, or 3 to choose direction.
        directionNum = (int)(4*Math.random());
        switch (directionNum) {
           case 0:  // move up 
              currentRow--;
              if (currentRow < 0)
                 currentRow = 9;
              break;
           case 1:  // move right
              currentColumn++;
              if (currentColumn >= 20)
                 currentColumn = 0;
              break; 
           case 2:  // move down
              currentRow ++;
              if (currentRow >= 10)
                 currentRow = 0;
              break;
           case 3:  
              currentColumn--;
              if (currentColumn < 0)
                 currentColumn = 19;
              break; 
        }
    }  // end of randomMove()
   
} // end of class RandomMosaicWalk