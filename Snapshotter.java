import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Snapshotter
{
    Rectangle screenRect = new Rectangle(Bejeweled.originX, Bejeweled.originY, (Bejeweled.squareDimension * 7) + 1,(Bejeweled.squareDimension * 7) + 1);
    BufferedImage image;
    private Robot rob;
    
    public Snapshotter(){
    	try {
			rob = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
    }
    
    public void takeBoardScreenshot() throws AWTException{
    	System.out.println("originX: " + Bejeweled.originX);
    	System.out.println("originY: " + Bejeweled.originY);
    	image = rob.createScreenCapture(screenRect);
    }
    
    public int getpixcolor(int x, int y) throws IOException, AWTException 
    {
    	//return -(new Robot()).createScreenCapture(screenRect).getRGB(x, y);
		return -image.getRGB(x, y);
    }
    
 
    

}
