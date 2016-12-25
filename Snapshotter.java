package GhoulCatchersBot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Snapshotter
{
    Rectangle screenRect = new Rectangle(GhoulCatchers.originX, GhoulCatchers.originY, (GhoulCatchers.squareDimension * 6),(GhoulCatchers.squareDimension * 6));
    Rectangle replayButton = new Rectangle(GhoulCatchers.originX + (GhoulCatchers.squareDimension * 3), GhoulCatchers.originY + (GhoulCatchers.squareDimension * 4), 100, 100);
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
    	if(GhoulCatchers.debugMsg) {
	    	System.out.println("originX: " + GhoulCatchers.originX);
	    	System.out.println("originY: " + GhoulCatchers.originY);
    	}
    	image = rob.createScreenCapture(screenRect);
    }
    
    public void takeReplayButtonScreenshot() throws AWTException {
    	image = rob.createScreenCapture(replayButton);
    	if(GhoulCatchers.saveScreenshots) {
	    	File outputfile = new File("replayButton.jpg");
	   	 	try {
	            ImageIO.write(image, "jpg", outputfile);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
    	}
    }
    
    public boolean isGameWon() {
    	for(int y = 0; y < image.getHeight(); y++){
			for(int x = 0; x < image.getWidth(); x++){
				if(image.getRGB(x, y) == Colors.replayButton.colorNum)
					return true;
			}
    	}
    	return false;
    }
    
    public int getGhoulColor(int cellColumn, int cellRow) throws IOException, AWTException 
    {
    	int squareTopLeftX = (cellColumn*GhoulCatchers.squareDimension);
    	int squareTopLeftY = (cellRow*GhoulCatchers.squareDimension);
    	BufferedImage ghoulImage = image.getSubimage(squareTopLeftX, squareTopLeftY, GhoulCatchers.squareDimension,GhoulCatchers.squareDimension );
    	
    	if(GhoulCatchers.saveScreenshots) {
    		File outputfile = new File("screenshot" + cellColumn + "" + cellRow + ".jpg");
	    	 try {
	             ImageIO.write(ghoulImage, "jpg", outputfile);
	         } catch (IOException e) {
	             e.printStackTrace();
	         }
    	}
    	
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
}
