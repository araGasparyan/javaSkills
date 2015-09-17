package linesfrominternet;

import java.awt.Point;
import java.util.Vector;
/*
	Authors:   Eugene Miretskiy
                   Konstantin Lukin
        Created:   April 12, 1997
        Purpose:   provides algorithm for finding the shortest path
                   from one point to another on a 9x9 matrix with
		   randomly filed cells.
*/
public class PathFinder {


private Vector vector;     // contains levelVectors
private int matrix[][];    // save info on visited cells
private Point to, from;    // find path from point to point
private boolean found;     // true if path is found



public PathFinder(Point _from, Point _to, int _matrix[][]) {
   from = new Point(_from.x, _from.y);
   to   = new Point(_to.x,   _to.y  );
   matrix = new int[9][9];
   for(int x=0; x<9; x++) { for(int y=0; y<9; y++) {matrix[x][y] = _matrix[x][y];}}
   vector = new Vector();
   Vector begin = new Vector();  // first level
   begin.addElement(new Cell(from, null));
   vector.addElement(begin);
   found = false;
}



/*
	precond:  constructor is called with specified parameters
	postcond: path of Points is returned if path is found or null otherwise
*/
public Point[] getPath() {
   buildStructure();
   if(!found) return null;

   int length=vector.size();
   Vector v=(Vector)(vector.elementAt(length-1));
   Cell cell = elementAt(v.size()-1,v);
   Point path[] = new Point[length];

   for(int i=length-1; i>=0; i--) {
      path[i]=cell.getPoint();
      cell=cell.parent;
   }
   return path;
}




/* 
	prints found path
*/
public String printPath() {
   String s = new String();
   Point path[] = getPath();
   if(path == null) { s = "No such path exists!"; return s; }
   for(int i=0; i<path.length; i++) {
      s += "[" + path[i].x + "," + path[i].y + "]";
      s += " -> ";
   }
   return s;
}




/*
	builds Vector(Vector(Cell)) structure while looking for path
*/ 
private void buildStructure() {
   int level = 0;
   while(!found && !done(getLevel(level))) {
      vector.addElement(buildLevel(++level));
   }
}



/*
	returns Vector of Cells of certain level
*/
private Vector getLevel(int level) {
   return (Vector)(vector.elementAt(level));
}



/*
	precond:  last level
	postcond: true if no path could be found
*/
private boolean done(Vector array) {
   return array.size() == 0;
}




/*
	precond:  vector and index of element in that vector
	postcond: Cell at index 
*/
private Cell elementAt(int i, Vector v) {
   return (Cell)v.elementAt(i);
}




/*
	precond:  level number
	postcond: new constructed level and updated matrix
*/
private Vector buildLevel(int level) {
   Cell cell;
   Vector levelVector = new Vector();  // empty
   Vector parent = getLevel(level-1);  // full without nulls
   
   for(int i=0; i<parent.size(); i++) {
      cell = elementAt(i, parent);
      if(addCell(levelVector, cell,  0,  1)) break;
      if(addCell(levelVector, cell,  0, -1)) break;
      if(addCell(levelVector, cell,  1,  0)) break;
      if(addCell(levelVector, cell, -1,  0)) break;
   }
   return levelVector;
}



/*
	add cell to the current level vector
*/
private boolean addCell(Vector vector, Cell parent, int dx, int dy) {
      Cell temp = new Cell(parent.x+dx, parent.y+dy, parent);
      if(vacant(temp)) {
         vector.addElement(temp);
         Point p = temp.getPoint();
         matrix[p.x][p.y] = 1;
      }
      return (found = temp.getPoint().equals(to)); 
}




/*
	true if cell could be placed in certain space
*/
private boolean vacant(Cell cell) {
   return inBounds(cell.getPoint()) && notTaken(cell.getPoint());
}




/* 
	true if cell is in bounds
*/
private boolean inBounds(Point p) {
   return (p.x >=0 && p.x <=8 && p.y >= 0 && p.y <= 8);
}




/*
	true if space is not taken
*/
private boolean notTaken(Point p) {
   return matrix[p.x][p.y] == 0;
}


}
