import java.util.*;

/**
 * @author markharrison
 *
 */
public class Board {

	public Stack<Queen> queenStack;

	/**
	 * 
	 * Constructor for a new board
	 */
	public Board() {

		queenStack = new Stack<>();

	}

	/**
	 * Takes a Queen object, iterates over the matrix whilst comparing the current
	 * value against the same value in the arraylist of the queen, adding the value
	 * to a temp arraylist if not found.
	 * 
	 * The temp list is then added to the matrix and set as the arraylist values for
	 * that queen and then the queen is added to the stack
	 * 
	 * 
	 */
	public boolean addQueen() {

		Queen temp = new Queen(queenStack.size());

		if (queenStack.isEmpty()) {

			addStackQueen(temp);
			return true;

		} else {

			for (int i = temp.getX() + 1; i <= 7; i++) {

				temp.setX(i);
				temp.setPos(i, queenStack.size());

				if (checkQueenThreat(temp) != null) {
					addStackQueen(temp);
					return true;

				}

			}
			return false;
		}

	}

	public boolean addQueenRemoved(Queen removed) {

		if (removed.getX() == 7) {

			addQueenRemoved(removeStackQueen());
		}

		for (int i = removed.getX() + 1; i <= 7; i++) {

			removed.setX(i);
			removed.setPos(removed.getX(), queenStack.size());

			if (checkQueenThreat(removed) != null) {
				addStackQueen(removed);
				return true;

			}

		}
		addQueenRemoved(removeStackQueen());
		return false;
	}

	public void playGame() {

		while (queenStack.size() < 8) {

			if (addQueen() == false) {

				addQueenRemoved(removeStackQueen());

			}

		}
	}

	public void addStackQueen(Queen queen) {

		queenStack.push(queen);

	}

	public Queen removeStackQueen() {

		return queenStack.pop();
	}

	/**
	 * Checks if a queen is threatened by any other on the board
	 * 
	 * @param queen
	 *            to test again
	 * @return true if it is threatened , false if not
	 */
	public Queen checkQueenThreat(Queen inputQueen) {

		int tempVarLeft = (inputQueen.getPos() - 9);
		int tempVarRight = (inputQueen.getPos() - 7);
		int tempVarUp = (inputQueen.getPos() - 8);

		for (int i = queenStack.size() - 1; i >= 0; i--) {

			if (queenStack.elementAt(i).getPos() == tempVarUp || queenStack.elementAt(i).getPos() == tempVarLeft
					|| queenStack.elementAt(i).getPos() == tempVarRight) {

				return null;

			}
			tempVarLeft = (tempVarLeft - 9);
			tempVarRight = (tempVarRight - 7);
			tempVarUp = (tempVarUp - 8);

		}
		return inputQueen;

	}

	/**
	 * prints the values in the stack
	 */
	public void printStack() {

		for (Queen x : queenStack) {

			x.toString();
		}

	}
}
