package GhoulCatchersBot;

import java.awt.Robot;
import java.awt.event.InputEvent;

public class MatcherRobot
{
	public static void findThem(int[][] grid) throws Exception 
	{
		Robot r = new Robot();
		
		outerloop:
		for (int y = 0; y < 6; y++)
		{
			for (int x = 0; x < 6; x++) 
			{
				// x
				// -
				// x
				// x

				if (x + 0 < 6 && y + 3 < 6)
				{
					if (grid[x + 0][y + 0] == grid[x + 0][y + 2] && grid[x + 0][y + 2] == grid[x + 0][y + 3])
					{
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 0)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 0)));
						clickMouse(r);
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 0)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 1)));
						clickMouse(r);
						break outerloop;
					}
				}


				// - x
				// x
				// x

				if (x + 1 < 6 && y + 2 < 6)
				{
					if (grid[x + 1][y + 0] == grid[x + 0][y + 1] && grid[x + 0][y + 1] == grid[x + 0][y + 2])
					{
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 1)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 0)));
						clickMouse(r);
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 0)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 0)));
						clickMouse(r);
						break outerloop;
					}
				}

				// x
				// - x
				// x

				if (x + 1 < 6 && y + 2 < 6) 
				{
					if (grid[x + 0][y + 0] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 0][y + 2])
					{
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 1)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 1)));
						clickMouse(r);
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 0)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 1)));
						clickMouse(r);
						break outerloop;
					}
				}

				// x
				// x
				// - x

				if (x + 1 < 6 && y + 2 < 6) 
				{
					if (grid[x + 0][y + 0] == grid[x + 0][y + 1] && grid[x + 0][y + 1] == grid[x + 1][y + 2])
					{
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 1)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 2)));
						clickMouse(r);
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 0)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 2)));
						clickMouse(r);
						break outerloop;
					}
				}


				// x
				// x
				// -
				// x

				if (x + 0 < 6 && y + 3 < 6) 
				{			
					if (grid[x + 0][y + 0] == grid[x + 0][y + 1] && grid[x + 0][y + 1] == grid[x + 0][y + 3]) 
					{
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 0)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 3)));
						clickMouse(r);
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 0)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 2)));
						clickMouse(r);
						break outerloop;
					}
				}


				// x -
				//   x
				//   x

				if (x + 1 < 6 && y + 2 < 6)
				{
					if (grid[x + 0][y + 0] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 1][y + 2]) 
					{
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 0)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 0)));
						clickMouse(r);
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 1)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 0)));
						clickMouse(r);
						break outerloop;
					}
				}


				//   x
				// x -
				//   x

				if (x + 1 < 6 && y + 2 < 6) 
				{
					if (grid[x + 1][y + 0] == grid[x + 0][y + 1] && grid[x + 0][y + 1] == grid[x + 1][y + 2]) 
					{
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 0)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 1)));
						clickMouse(r);
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 1)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 1)));
						clickMouse(r);
						break outerloop;
					}
				}


				//   x
				//   x
				// x -

				if (x + 1 < 6 && y + 2 < 6) 
				{
					if (grid[x + 1][y + 0] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 0][y + 2]) 
					{
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 0)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 2)));
						clickMouse(r);
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 1)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 2)));
						clickMouse(r);
						break outerloop;
					}
				}


				// xx-x

				if (x + 3 < 6) 
				{
					if (grid[x][y] == grid[x + 1][y] && grid[x + 1][y] == grid[x + 3][y]) 
					{
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 3)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * y));
						clickMouse(r);
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 2)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * y));
						clickMouse(r);
						break outerloop;
					}
				}


				// x--
				// -xx

				if (x + 2 < 6 && y + 1 < 6)
				{
					if (grid[x][y] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 2][y + 1])
					{
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 0)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 0)));
						clickMouse(r);
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 0)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 1)));
						clickMouse(r);
						break outerloop;
					}
				}

				// -x-
				// x-x
				if (x + 2 < 6 && y + 1 < 6) 
				{
					if (grid[x + 0][y + 1] == grid[x + 1][y + 0] && grid[x + 1][y + 0] == grid[x + 2][y + 1])
					{
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 1)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 0)));
						clickMouse(r);
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 1)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 1)));
						clickMouse(r);
						break outerloop;
					}
				}


				// --x
				// xx-

				if (x + 2 < 6 && y + 1 < 6)
				{
					if (grid[x + 0][y + 1] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 2][y + 0])
					{
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 2)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 0)));
						clickMouse(r);
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 2)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 1)));
						clickMouse(r);
						break outerloop;
					}
				}

				// x-xx

				if (x + 3 < 6) 
				{
					if (grid[x][y] == grid[x + 2][y] && grid[x + 2][y] == grid[x + 3][y])
					{
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 0)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * y));
						clickMouse(r);
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 1)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * y));
						clickMouse(r);
						break outerloop;
					}
				}

				// -xx
				// x--

				if (x + 2 < 6 && y + 1 < 6)
				{
					if (grid[x + 0][y + 1] == grid[x + 1][y + 0] && grid[x + 1][y + 0] == grid[x + 2][y + 0]) 
					{
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 0)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 1)));
						clickMouse(r);
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 0)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 0)));
						clickMouse(r);
						break outerloop;
					}
				}


				// x-x
				// -x-

				if (x + 2 < 6 && y + 1 < 6) 
				{
					if (grid[x + 0][y + 0] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 2][y + 0]) 
					{
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 1)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 1)));
						clickMouse(r);
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 1)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 0)));
						clickMouse(r);
						break outerloop;
					}
				}


				// xx-
				// --x

				if (x + 2 < 6 && y + 1 < 6) 
				{
					if (grid[x + 0][y + 0] == grid[x + 1][y + 0] && grid[x + 1][y + 0] == grid[x + 2][y + 1]) 
					{
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 2)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 1)));
						clickMouse(r);
						r.mouseMove((GhoulCatchers.originX + (GhoulCatchers.squareDimension/2))  + (GhoulCatchers.squareDimension * (x + 2)), (GhoulCatchers.originY + (GhoulCatchers.squareDimension/2)) + (GhoulCatchers.squareDimension * (y + 0)));
						clickMouse(r);
						break outerloop;
					}
				}
			}
		}
	}
	
	public static void clickMouse(Robot r) {
		r.mousePress(InputEvent.BUTTON1_MASK);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		r.mouseRelease(InputEvent.BUTTON1_MASK);
	}
}
