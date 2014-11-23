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
				if(x == 523 && y == 266){
					System.out.println(image.getRGB(x, y));
				}
				if(image.getRGB(x, y) == -Colors.originPixel.colorNum && image.getRGB(x, y+1) == -Colors.originBottomPixel.colorNum){
					return new Point(x + Bejeweled.squareDimension/2, y + Bejeweled.squareDimension/2);
				}
			}
		}
//		int TL;
//		for (int y = 0; y < Toolkit.getDefaultToolkit().getScreenSize().height; y++)
//		{
//
//			for (int x =0; x < Toolkit.getDefaultToolkit().getScreenSize().width; x++) 
//			{ 
//				TL= -image.getRGB(x, y);
//
//				if (TL == Colors.white.colorNum || TL == Colors.blue.colorNum || TL == Colors.green.colorNum || TL == Colors.orange.colorNum || TL == Colors.yellow.colorNum || TL == Colors.purple.colorNum)
//				{
//					if(-image.getRGB(x, y) == Colors.white.colorNum){
//						System.out.println();
//					}
//					TL= -image.getRGB(x, y+Bejeweled.squareDimension);
//					if (TL == Colors.white.colorNum || TL == Colors.blue.colorNum || TL == Colors.green.colorNum || TL == Colors.orange.colorNum || TL == Colors.yellow.colorNum || TL == Colors.purple.colorNum)
//					{
//						TL= -image.getRGB(x+Bejeweled.squareDimension*2, y+Bejeweled.squareDimension*2);
//						if (TL == Colors.white.colorNum || TL == Colors.blue.colorNum || TL == Colors.green.colorNum || TL == Colors.orange.colorNum || TL == Colors.yellow.colorNum || TL == Colors.purple.colorNum)
//						{
//							return new Point(x, y);
//						}
//					}
//				}
//			}
//		}
		return null;
	}
}
