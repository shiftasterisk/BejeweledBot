package GhoulCatchersBot;

import java.awt.Robot;
import java.awt.event.InputEvent;

public class GamePlayer {
	private Robot robot;

	int originX;
	int originY;
	int squareDimension;

	public GamePlayer(Game game) throws Exception {
		robot = game.robot;
		this.originX = game.gameParameters.originX;
		this.originY = game.gameParameters.originY;
		this.squareDimension = game.gameParameters.squareDimension;
	}

	public void moveToOrigin() {
		robot.mouseMove(originX, originY);
	}

	public void restartGame() throws Exception {
		robot.mouseMove(originX + (squareDimension * 3), originY + (squareDimension * 4) + (squareDimension/2) + (squareDimension/100));
		clickMouse();
	}

	public void makeMove(int[][] grid) {
		Move move = MoveFinder.findMove(grid);
		
		if(move != null) {
			if(GhoulCatchers.debugMsg)
				System.out.println("Moving " + move.originSquareX + "," + move.originSquareY + " to " + move.destinationSquareX + "," + move.destinationSquareY);
			robot.mouseMove((originX + (squareDimension/2))  + (squareDimension * move.originSquareX), (originY + (squareDimension/2)) + (squareDimension * move.originSquareY));
			clickMouse();
			robot.mouseMove((originX + (squareDimension/2))  + (squareDimension * move.destinationSquareX), (originY + (squareDimension/2)) + (squareDimension * move.destinationSquareY));
			clickMouse();
		}
	}

	public void clickMouse() {
		robot.mousePress(InputEvent.BUTTON1_MASK);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}
}
