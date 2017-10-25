import java.util.*;

/**
 * @author markharrison
 *
 */
public class Board {

	public boolean check;
	public Stack<Queen> queenStack;
	public Iterator<Queen> iterator;
	public int tempVarLeft, tempVarRight, size;

	/**
	 * 
	 * Constructor for a new board
	 * 
	 * @param size
	 *            of the board size x size
	 */
	public Board(int size) {

		this.size = size;
		queenStack = new Stack<>();
	}

	/**
	 * getter for the size variable
	 * 
	 * @return size
	 */
	public int getSize() {

		return this.size;
	}

	/**
	 * Creates a new Queen object with a set y co-ordinate and checks for other
	 * threatening queens whilst advancing the x co-ordinate if a threat is found.
	 * 
	 * @param row
	 *            the current row the queen is set on
	 * @return true if the queen can be placed on that row or false if not.
	 */
	public boolean placeQueen(int row) {

		Queen temp = new Queen(1, row, this.size);

		if (queenStack.isEmpty()) {
			queenStack.push(temp);
			return true;
		} else {

			for (int i = 2; i <= this.size; i++) {

				if (checkThreat(temp) == false) {
					queenStack.push(temp);
					return true;

				}

			}

		}

		return false;

	}

	/**
	 * Checks if a queen is threatened by any other on the board
	 * 
	 * @param subject
	 *            queen to test again
	 * @return true if it is threatened , false if not
	 */
	public boolean checkThreat(Queen subject) {

		Boolean collision = null;

		for (int j = 1; j <= size; j++) {

			subject.setX(j);
			subject.setPos(size);
			for (Queen i : queenStack) {
				tempVarLeft = subject.getPos();
				tempVarRight = subject.getPos();
				if (i.getX() == subject.getX()) {
					collision = true;
				}else {
				while (tempVarLeft > 1 && tempVarRight > 1) {

					tempVarLeft = tempVarLeft - 9;
					tempVarRight = tempVarRight - 7;

					if (i.getPos() == tempVarLeft || i.getPos() == tempVarRight) {

						collision = true;
					}
				}
				}
			}
		}
		if (collision == true) {

			return true;
		} else {
			return false;
		}

	}

	public void printBoard() {

		if (queenStack.isEmpty()) {

			System.out.print("Nothing to print\n");
		}

		for (int k = 1; k <= this.size; k++) {

			for (int h = 1; h <= this.size; h++) {
				boolean check = false;
				for (Queen x : queenStack) {

					if (x.getX() == h && x.getY() == k) {

						System.out.print("X");

						check = true;

					}

				}
				if (check == false) {
					System.out.print("O");

				}
			}
			System.out.print("\n");

		}
	}

	public void printStack() {

		for (Queen x : queenStack) {

			x.printStatus();

		}

	}
}
