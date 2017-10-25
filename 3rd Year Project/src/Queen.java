/**
 * 
 */

/**
 * @author markharrison
 * A class which models a Queen piece on a chess board
 */

public class Queen {

	private int x;
	private int y;
	private int pos;

/**
 *  Constructor for Queen object
 * @param x is the x position on the board
 * @param y is the y position on the board
 * @param pos is the composition of x and y used for checking if this Queen is threatened by other Queens
 */


public Queen () {
	
	this.x = 1;
	this.y = 1;
	this.pos = 1;
	
}

/**
 * 2nd constructor if we have parameters we wish to set
 *
 * @param x x co-ordinate 
 * @param y y co-ordinate
 * @param size size of the board
 */
public Queen (int x, int y,int size) {

	this.x = x;
	this.y = y;
	this.pos =  this.x + (y-1) * size;
	
}

/**
 * getter for the x coordinate
 * @return the x variable
 */
public int getX() {
	
	return this.x;
	
}
/**
 * Getter for Y position
 * @return the y variable
 */
public int getY() {
	
	return this.y;
}

/**
 * Getter for position
 * @return returns the position variable
 */
public int getPos() {
	return this.pos;
}
	

/**
 * Setter for x variable
 * @param x the x position 
 */
public void setX(int x) {
	
	this.x = x;
	
}
/**
 * Setter for Y variable
 * @param y the y position
 */
public void setY(int y) {
	
	this.y = y;
}
/**
 * Setter for Pos variable
 * @param size the size of the board being used
 */
public void setPos(int size) {
	
	this.pos = this.x + (y-1) * size;
}
public void printStatus() {
	
	System.out.print("X = " + this.x + ", Y = " + this.y + ", Pos = "+ this.pos+ "\n");
	
}


}
