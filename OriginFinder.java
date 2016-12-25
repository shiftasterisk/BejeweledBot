package GhoulCatchersBot;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class OriginFinder
{
	static Rectangle cali = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

	static Point findOrigin() throws IOException, AWTException 
	{
		BufferedImage image = (new Robot()).createScreenCapture(cali);
		for(int y = 0; y < image.getHeight(); y++){
			for(int x = 0; x < image.getWidth(); x++){
				if(image.getRGB(x, y) == -Colors.originPixel.colorNum && image.getRGB(x, y+1) == -Colors.originBottomPixel.colorNum){
					return new Point(x + 2, y - 2);
				}
			}
		}
		return null;
	}
}
