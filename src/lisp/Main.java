package lisp;

import javax.swing.JFrame;

public abstract class Main {

	public static void main(String[] args) {
		JFrame gameFrame = new JFrame("Lasers In Space! -- and Pong");
		GameRoom gameRoom = new GameRoom();
		gameFrame.add(gameRoom.getPanel());
		gameFrame.pack();
		gameFrame.setVisible(true);
		gameRoom.getPanel().requestFocusInWindow();
		gameRoom.startGame();
	}

}
