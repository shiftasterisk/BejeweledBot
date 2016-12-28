package GhoulCatchersBot;

import java.awt.Robot;

public class Game{
	public int[][] grid;

	public Robot robot;
	public Screenshotter screenshotter;
	public GameParameters gameParameters;
	public GamePlayer gamePlayer;

	public Game() throws Exception {
		grid = new int[6][6];
		robot = new Robot();
		screenshotter = new Screenshotter(this);
		gameParameters = new GameParameters(this);
		screenshotter.setGameParameters(gameParameters);
		gamePlayer = new GamePlayer(this);
		gamePlayer.moveToOrigin();
	}

	public void autoPlay() throws Exception {
		if(!GameUtils.isCursorAtOrigin(this)) 
			throw new Exception("Cursor moved, stopping bot");

		if(GameUtils.isGameWon(this)) {
			processWin();
		} else {
			GameUtils.scanGrid(this);
			if(GhoulCatchers.debugMsg)
				GameUtils.printGrid(this);
			gamePlayer.makeMove(grid);
		}
		gamePlayer.moveToOrigin();
		Thread.sleep(GameUtils.randomMoveWait());
	}

	public void processWin() throws Exception {
		GhoulCatchers.gamesWon++;
		System.out.println("Game Won - Total Won " + GhoulCatchers.gamesWon);
		gamePlayer.restartGame();
		Thread.sleep(1000);
	}
}