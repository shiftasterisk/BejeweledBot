package GhoulCatchersBot;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class GameUtils
{
	public static boolean isCursorAtOrigin(Game game) {
		PointerInfo pointer = MouseInfo.getPointerInfo();
		Point coord = pointer.getLocation();

		if(coord.getX() == game.gameParameters.originX && coord.getY() == game.gameParameters.originY)
			return true;

		return false;
	}

	public static boolean isGameWon(Game game) throws Exception {
		BufferedImage replayButtonImage = game.screenshotter.takeReplayButtonScreenshot();
		for(int y = 0; y < replayButtonImage.getHeight(); y++){
			for(int x = 0; x < replayButtonImage.getWidth(); x++){
				if(replayButtonImage.getRGB(x, y) == Colors.replayButton.colorNum)
					return true;
			}
		}
		return false;
	}

	public static void scanGrid(Game game) throws Exception {	
		BufferedImage gridImage = game.screenshotter.takeBoardScreenshot();
		int color;
		int invalidColor = 7;

		for (int y = 0; y < game.grid[0].length; y++)
		{
			for (int x = 0; x < game.grid.length; x++)
			{
				BufferedImage ghoulImage = game.screenshotter.getGhoulImage(gridImage, x, y);
				color = GameUtils.getGhoulColor(ghoulImage);
				if(color != 0)
					game.grid[x][y] = color;
				else
					game.grid[x][y] = invalidColor;
				invalidColor++;
				continue;
			}
		}
	}

	public static void printGrid(Game game) throws Exception {
		System.out.println("\n");
		for (int cellRow = 0; cellRow < 6; cellRow++)
		{
			for (int cellColumn = 0; cellColumn < 6; cellColumn++)
			{
				System.out.print(game.grid[cellColumn][cellRow]);
				System.out.print("; ");
			}
			System.out.println("\n");
		}
	}

	public static int getGhoulColor(BufferedImage ghoulImage) throws IOException, AWTException 
	{
		for(int y = 0; y < ghoulImage.getHeight(); y++){
			for(int x = 0; x < ghoulImage.getWidth(); x++){
				if(ghoulImage.getRGB(x, y) == Colors.red.colorNum){
					return 1;
				}
				if(ghoulImage.getRGB(x, y) == Colors.orange.colorNum){
					return 2;
				}
				if(ghoulImage.getRGB(x, y) == Colors.yellow.colorNum){
					return 3;
				}
				if(ghoulImage.getRGB(x, y) == Colors.green.colorNum){
					return 4;
				}
				if(ghoulImage.getRGB(x, y) == Colors.blue.colorNum){
					return 5;
				}
				if(ghoulImage.getRGB(x, y) == Colors.purple.colorNum){
					return 6;
				}
			}
		}

		return 0;
	}
	
	public static int randomMoveWait() {
		Random random = new Random();
		return random.nextInt(1500) + 1500;
		
	}
}