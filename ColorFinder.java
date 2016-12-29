package GhoulCatchersBot;

import java.awt.AWTException;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * run this class when needing to find updated color values for the grid, will auto detect the grid.
 *
 */
public class ColorFinder {

	public static void main(String[] args) throws Exception {
		Settings settings = new Settings();
		Game game = new Game(settings);
		BufferedImage gridImage = game.screenshotter.takeBoardScreenshot();
		for(int y = 0; y < 6; y++){
			for(int x = 0; x < 6; x++){
				BufferedImage ghoulImage = game.screenshotter.getGhoulImage(gridImage, x, y);
				System.out.print(getDensestColor(ghoulImage) + " - ");
			}
			System.out.println("\n");
		}
	}

	public static int getDensestColor(BufferedImage ghoulImage) throws IOException, AWTException 
	{
		int densestColor = 0;
		int colorAppearances = 0;
		HashMap<Integer, Integer> squareColors = new HashMap<Integer, Integer>();
		for(int y = 0; y < ghoulImage.getHeight(); y++){
			for(int x = 0; x < ghoulImage.getWidth(); x++){
				int color = ghoulImage.getRGB(x, y);
				if(!squareColors.containsKey(ghoulImage.getRGB(x, y)))
					squareColors.put(color, 1);
				else
					squareColors.put(color, squareColors.get(color)+1);
			}
		}

		for (Entry<Integer, Integer> entry : squareColors.entrySet()) {
			if(entry.getValue() > colorAppearances) {
				densestColor = entry.getKey();
				colorAppearances = entry.getValue();
			}
		}

		return densestColor;
	}

}
