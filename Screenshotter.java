package GhoulCatchersBot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Screenshotter
{  
	private Robot robot;
	private GameParameters gameParameters;
	private boolean saveScreenshots;

	public Screenshotter(Game game) throws Exception {
		robot = game.robot;
		saveScreenshots = game.settings.saveScreenshots;
	}

	public BufferedImage takeScreenshot() throws AWTException {
		Rectangle screenArea = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage screenImage = robot.createScreenCapture(screenArea);
		if(saveScreenshots) {
			saveScreenshot(screenImage, "screenshot.jpg");
		}
		return screenImage;
	}

	public BufferedImage takeBoardScreenshot() throws AWTException{
		Rectangle gridArea = new Rectangle(gameParameters.originX, gameParameters.originY, (gameParameters.squareDimension * 6),(gameParameters.squareDimension * 6));
		BufferedImage gridImage = robot.createScreenCapture(gridArea);
		if(saveScreenshots) {
			saveScreenshot(gridImage, "gridArea.jpg");
		}
		return gridImage;
	}

	public BufferedImage takeReplayButtonScreenshot() throws AWTException {
		Rectangle replayButtonArea = new Rectangle(gameParameters.originX + (gameParameters.squareDimension * 3) + gameParameters.replayButtonXOffset, gameParameters.originY + (gameParameters.squareDimension * 4) + gameParameters.replayButtonYOffset, 100, 100);
		BufferedImage replayButtonImage = robot.createScreenCapture(replayButtonArea);
		if(saveScreenshots) {	
			saveScreenshot(replayButtonImage, "replayButton.jpg");
		}
		return replayButtonImage;
	}

	public BufferedImage getGhoulImage(BufferedImage gridImage, int cellColumn, int cellRow) {
		int squareTopLeftX = (cellColumn*gameParameters.squareDimension);
		int squareTopLeftY = (cellRow*gameParameters.squareDimension);
		BufferedImage ghoulImage = gridImage.getSubimage(squareTopLeftX, squareTopLeftY, gameParameters.squareDimension, gameParameters.squareDimension );

		if(saveScreenshots) {
			saveScreenshot(ghoulImage, "screenshot" + cellColumn + "" + cellRow + ".jpg");
		}
		return ghoulImage;
	}

	public void saveScreenshot(BufferedImage screenShot, String fileName) {
		File outputfile = new File(fileName);
		try {
			ImageIO.write(screenShot, "jpg", outputfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setGameParameters(GameParameters gameParameters) {
		this.gameParameters = gameParameters;
	}
}
