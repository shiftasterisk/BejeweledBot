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

public class OriginFinder
{
	static Rectangle cali = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

	static Point findOrigin() throws IOException, AWTException 
	{
		BufferedImage image = (new Robot()).createScreenCapture(cali);
    	if(GhoulCatchers.saveScreenshots) {
    		File outputfile = new File("screenshot.jpg");
	    	 try {
	             ImageIO.write(image, "jpg", outputfile);
	         } catch (IOException e) {
	             e.printStackTrace();
	         }
    	}
		for(int y = 0; y < image.getHeight(); y++){
			for(int x = 0; x < image.getWidth(); x++){
				if(image.getRGB(x, y) == -Colors.originPixel.colorNum && image.getRGB(x, y + 1) == -Colors.originBottomPixel.colorNum){
					return new Point(x, y);
				}
			}
		}
		return null;
	}
	
	static int getSquareDimension(int originX, int originY) throws IOException, AWTException 
	{
		BufferedImage image = (new Robot()).createScreenCapture(cali);
    	if(GhoulCatchers.saveScreenshots) {
    		File outputfile = new File("screenshot.jpg");
	    	 try {
	             ImageIO.write(image, "jpg", outputfile);
	         } catch (IOException e) {
	             e.printStackTrace();
	         }
    	}
		for(int y = 0; y < image.getHeight(); y++){
			for(int x = originX; x < image.getWidth(); x++){
				if(image.getRGB(x, y) == -Colors.endPixel.colorNum && image.getRGB(x, y + 1) == -Colors.endBottomPixel.colorNum){
					return (x - originX)/6;
				}
			}
		}
		return 0;
	}
}