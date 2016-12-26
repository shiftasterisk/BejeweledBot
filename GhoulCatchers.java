package GhoulCatchersBot;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;

/**
 * run this class when on the actual ghoul catchers grid
 * may not move the ghoul catchers screen after execution. will calibrate after first execution
 * continues to run and process jewels game after game.
 */
public class GhoulCatchers 
{
	public static int[][] grid = new int[6][6];
	
	static int squareDimension = 0;
	static long starttime = System.currentTimeMillis();
	static boolean debugMsg = false;
	static boolean saveScreenshots = false;

	//x and y indicate the center of the origin square (upper left)
	public static int originX;
	public static int originY;
	public static int gamesWon = 0;

	public static void main(String[] args) throws Exception
	{
		Thread.sleep(5000);
		Robot r = new Robot();
		Point origin = OriginFinder.findOrigin();
		
		if(origin == null){
			System.out.println("origin of ghoul catchers grid not found!");
			return;
		}
		else{
			originX = origin.x;
			originY = origin.y;
			
			squareDimension = OriginFinder.getSquareDimension(originX, originY);

			if(squareDimension == 0) {
				System.out.println("Could not determine square dimension");
				return;
			}
			
			System.out.println(origin);						
			System.out.println("SqaureDimension - " + squareDimension);
			
			r.mouseMove(originX, originY);
	
			while(gamesWon < 50)
			{
				PointerInfo pointer = MouseInfo.getPointerInfo();
			    Point coord = pointer.getLocation();
			    if(coord.getX() == originX && coord.getY() == originY) {
					if(GridScanner.checkWin()) {
						gamesWon++;
						r.mouseMove(originX + (squareDimension * 3), originY + (GhoulCatchers.squareDimension * 4) + (GhoulCatchers.squareDimension/2));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseRelease(InputEvent.BUTTON1_MASK);
						System.out.println("Game Won - Total Won " + gamesWon);
					}
					GridScanner.scan(grid);
					if(debugMsg){
						System.out.println("\n");
						for (int cellRow = 0; cellRow < 6; cellRow++)
						{
							for (int cellColumn = 0; cellColumn < 6; cellColumn++)
							{
								System.out.print(grid[cellColumn][cellRow]);
								System.out.print("; ");
							}
							System.out.println("\n");
						}
					}
					MatcherRobot.findThem(grid);
					r.mouseMove(originX, originY);
					Thread.sleep(3000);
			    } else {
			    	break;
			    }
			}
		}
	}
}
