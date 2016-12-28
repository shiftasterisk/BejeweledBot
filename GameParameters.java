package GhoulCatchersBot;

import java.awt.image.BufferedImage;

public class GameParameters {
	public int originX;
	public int originY;
	public int squareDimension;

	private Screenshotter screenshotter;
	private BufferedImage screenImage;

	public GameParameters(Game game) throws Exception {
		this.screenshotter = game.screenshotter;
		screenImage = screenshotter.takeScreenshot();
		determineOrigin();
		determineSquareDimension();
		System.out.println("Origin - " + originX + "," + originY);	
		System.out.println("SqaureDimension - " + squareDimension);
	}


	private void determineOrigin() throws Exception {
		for(int y = 0; y < screenImage.getHeight(); y++){
			for(int x = 0; x < screenImage.getWidth(); x++){
				if(screenImage.getRGB(x, y) == -Colors.originPixel.colorNum && screenImage.getRGB(x, y + 1) == -Colors.originBottomPixel.colorNum){
					originX = x;
					originY = y;
					return;
				}
			}
		}
		throw new Exception("Could not find grid");
	}

	private void determineSquareDimension() throws Exception {
		for(int y = 0; y < screenImage.getHeight(); y++){
			for(int x = originX; x < screenImage.getWidth(); x++){
				if(screenImage.getRGB(x, y) == -Colors.endPixel.colorNum && screenImage.getRGB(x, y + 1) == -Colors.endBottomPixel.colorNum){
					squareDimension = (x - originX)/6;
					return;
				}
			}
		}
		throw new Exception("Could not find square dimension");
	}
}
