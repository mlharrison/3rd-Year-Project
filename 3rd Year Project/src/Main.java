
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Board game = new Board(8);
		for (int i = 1; i <= 8; i++) {
			
			
			if(game.placeQueen(i) == true) {
				
				System.out.println("Queen placed row "+ (i));
			}else {
				System.out.println("Queen NOT placed row "+ (i));
				
			}
			
		}
	
		game.printBoard();
		System.out.println("Size of stack =" + game.queenStack.size());

	}

}
