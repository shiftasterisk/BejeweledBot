import java.awt.Point;
import java.awt.Robot;

/**
 * run this class when on the actual bejeweled grid
 * may not move the bejeweled screen after execution. will calibrate after first execution
 * continues to run and process jewels game after game.
 */
public class Bejeweled 
{
	public static int[][] grid = new int[8][8];

	static final int squareDimension = 40;
	static long starttime = System.currentTimeMillis();
	static boolean debugMsg = true;

	//x and y indicate the center of the origin square (upper left)
	public static int originX;
	public static int originY;

	public static void main(String[] args) throws Exception
	{
		Robot r = new Robot();
		Point origin = OriginFinder.findOrigin();
		if(origin == null){
			System.out.println("origin of bejeweled grid not found!");
			return;
		}
		else{
			originX = origin.x;
			originY = origin.y;

			System.out.println(origin);
			
			r.mouseMove(originX, originY);
	
			while(true)
			{
				GridScanner.scan(grid);
				if(debugMsg){
					System.out.println("\n");
					for (int y = 0; y < 8; y++)
					{
						for (int x = 0; x < 8; x++)
						{
							System.out.print(grid[x][y]);
							System.out.print("; ");
						}
						System.out.println("\n");
					}
				}
				MatcherRobot.findThem(grid);
				//thread timing is special? other timings seem to cause picture capture errors where it captures an arbitrary squareDimension length away from the actual origin?
				Thread.sleep(100);
			}


		}
	}
}
