import java.awt.AWTException;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

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
					origin = new Point(x, y);
					break;
				}
			}
		}
		

		System.out.println(origin);
		origin.x = origin.x + Bejeweled.squareDimension/2;
		origin.y = origin.y + Bejeweled.squareDimension/2;
		
		for(int y = 0; y < 8; y++){
			for(int x = 0; x < 8; x++){
				//System.out.print(String.format("(%d, %d)", origin.x + (40 * x), origin.y + (40 * y)));
				System.out.print(desktopCapture.getRGB(origin.x + (40 * x), origin.y + (40 * y)));
			}
			System.out.println("\n");
		}
	}

}
