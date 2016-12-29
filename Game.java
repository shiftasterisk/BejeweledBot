package GhoulCatchersBot;

import java.awt.Robot;

public class Game{
	public int[][] grid;

	public Robot robot;
	public Settings settings;
	public Screenshotter screenshotter;
	public GameParameters gameParameters;
	public GamePlayer gamePlayer;

	public Game(Settings settings) throws Exception {
		grid = new int[6][6];
		robot = new Robot();
		this.settings = settings;
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
			if(settings.debugMsg)
				GameUtils.printGrid(this);
			gamePlayer.makeMove(grid);
		}
		gamePlayer.moveToOrigin();
		Thread.sleep(GameUtils.randomMoveWait((int)settings.slowestMoveSpeed*1000, (int)settings.fastestMoveSpeed*1000));
	}

	public void processWin() throws Exception {
		GhoulCatchers.gamesWon++;
		System.out.println("Game Won - Total Won " + GhoulCatchers.gamesWon);
		gamePlayer.restartGame();
		Thread.sleep(1000);
	}
}