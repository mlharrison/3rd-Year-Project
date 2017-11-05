import java.util.ArrayList;

/**
 * 
 */

/**
 * @author markharrison A class which models a Queen piece on a chess board
 */

public class Queen {

	private int pos;
	private int x;
	private int y;



	public Queen(int y) {
		
		this.pos = x * 1 + y * 8;
		this.x = 0;
		this.y = y;
		
	}
	
	public Queen(int x,int y) {
		
		this.pos = x * 1 + y * 8;
		this.x = x;
		this.y = y;
		
	}
	


	public void setPos(int x,int y) {

		this.pos = x * 1 + y * 8;
	}

	public int getPos() {

		return this.pos;
	}

	public void setX(int x) {
		
		this.x = x;
	}
	public int getX() {
		
		return this.x;
	}
	public void setY(int y) {
		
		this.y = y;
	}
	public int getY() {
		
		return this.y;
	}
	

}
