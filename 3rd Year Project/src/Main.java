
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Board game = new Board();
		game.playGame();
		for (Queen x : game.queenStack) {

			System.out.println("pos = " + x.getPos() + "  x = " + x.getX() + "  y = " + x.getY());
		}

		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 8; j++) {

				if (game.queenStack.elementAt(i).getPos() == (i * 8) + (j * 1)){
			
				System.out.print("X");
			}else {
				System.out.print("O");
			}
			
		}
			System.out.println("");
	}
}
}
