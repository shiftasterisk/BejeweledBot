package GhoulCatchersBot;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * run this class when needing to find updated color values for the grid, will auto detect the grid.
 *
 */
public class ColorFinder {

	public static void main(String[] args) throws AWTException {
		Robot rob = new Robot();
		BufferedImage desktopCapture = rob.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		Point origin = null;
		for(int y = 0; y < desktopCapture.getHeight(); y++){
			for(int x = 0; x < desktopCapture.getWidth(); x++){
				if(x == 523 && y == 266){
					System.out.println(desktopCapture.getRGB(x, y));
				}
				if(desktopCapture.getRGB(x, y) == -Colors.originPixel.colorNum && desktopCapture.getRGB(x, y+1) == -Colors.originBottomPixel.colorNum){
					origin = new Point(x+2, y-2);
					break;
				}
			}
		}


		System.out.println(origin);
		origin.x = origin.x;
		origin.y = origin.y;

		for(int y = 0; y < 6; y++){
			for(int x = 0; x < 6; x++){
				System.out.print(desktopCapture.getRGB(origin.x + (40 * x), origin.y + (40 * y)));

				BufferedImage miniShot = desktopCapture.getSubimage(origin.x + (x*GhoulCatchers.squareDimension), origin.y + (y*GhoulCatchers.squareDimension), GhoulCatchers.squareDimension,GhoulCatchers.squareDimension );
				if(GhoulCatchers.saveScreenshots) { 
					try {
						File outputfile = new File("screenshot" + x + "" + y + ".jpg");
						ImageIO.write(miniShot, "jpg", outputfile);

					} catch (IOException e) {

						e.printStackTrace();

					}
				}
			}
			System.out.println("\n");
		}
	}

}
