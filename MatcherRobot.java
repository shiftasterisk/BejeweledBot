import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Random;

public class MatcherRobot
{

	public static void findThem(int[][] grid) throws Exception 
	{
		Robot r = new Robot();
		Random random = new Random();

		for (int y = 0; y < 8; y++)
		{
			for (int x = 0; x < 8; x++) 
			{
				// x
				// -
				// x
				// x

				if (x + 0 < 8 && y + 3 < 8)
				{
					if (grid[x + 0][y + 0] == grid[x + 0][y + 2] && grid[x + 0][y + 2] == grid[x + 0][y + 3])
					{
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 0)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 1)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
					}
				}


				// - x
				// x
				// x

				if (x + 1 < 8 && y + 2 < 8)
				{
					if (grid[x + 1][y + 0] == grid[x + 0][y + 1] && grid[x + 0][y + 1] == grid[x + 0][y + 2])
					{
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 1)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 0)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 0)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
					}
				}

				// x
				// - x
				// x

				if (x + 1 < 8 && y + 2 < 8) 
				{
					if (grid[x + 0][y + 0] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 0][y + 2])
					{
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 1)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 1)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 1)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
					}
				}

				// x
				// x
				// - x

				if (x + 1 < 8 && y + 2 < 8) 
				{
					if (grid[x + 0][y + 0] == grid[x + 0][y + 1] && grid[x + 0][y + 1] == grid[x + 1][y + 2])
					{
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 1)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 2)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 2)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
					}
				}


				// x
				// x
				// -
				// x

				if (x + 0 < 8 && y + 3 < 8) 
				{			
					if (grid[x + 0][y + 0] == grid[x + 0][y + 1] && grid[x + 0][y + 1] == grid[x + 0][y + 3]) 
					{
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 3)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 2)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
					}
				}


				// x -
				//   x
				//   x

				if (x + 1 < 8 && y + 2 < 8)
				{
					if (grid[x + 0][y + 0] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 1][y + 2]) 
					{
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 0)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 1)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 0)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
					}
				}


				//   x
				// x -
				//   x

				if (x + 1 < 8 && y + 2 < 8) 
				{
					if (grid[x + 1][y + 0] == grid[x + 0][y + 1] && grid[x + 0][y + 1] == grid[x + 1][y + 2]) 
					{
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 1)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 1)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 1)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
					}
				}


				//   x
				//   x
				// x -

				if (x + 1 < 8 && y + 2 < 8) 
				{
					if (grid[x + 1][y + 0] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 0][y + 2]) 
					{
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 2)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 1)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 2)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
					}
				}


				// xx-x

				if (x + 3 < 8) 
				{
					if (grid[x][y] == grid[x + 1][y] && grid[x + 1][y] == grid[x + 3][y]) 
					{
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 3)), Bejeweled.originY + (Bejeweled.squareDimension * y));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 2)), Bejeweled.originY + (Bejeweled.squareDimension * y));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
					}
				}


				// x--
				// -xx

				if (x + 2 < 8 && y + 1 < 8)
				{
					if (grid[x][y] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 2][y + 1])
					{
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 0)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 1)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
					}
				}

				// -x-
				// x-x
				if (x + 2 < 8 && y + 1 < 8) 
				{
					if (grid[x + 0][y + 1] == grid[x + 1][y + 0] && grid[x + 1][y + 0] == grid[x + 2][y + 1])
					{
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 1)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 0)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 1)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 1)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
					}
				}


				// --x
				// xx-

				if (x + 2 < 8 && y + 1 < 8)
				{
					if (grid[x + 0][y + 1] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 2][y + 0])
					{
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 2)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 0)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 2)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 1)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
					}
				}

				// x-xx

				if (x + 3 < 8) 
				{
					if (grid[x][y] == grid[x + 2][y] && grid[x + 2][y] == grid[x + 3][y])
					{
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * y));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 1)), Bejeweled.originY + (Bejeweled.squareDimension * y));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
					}
				}

				// -xx
				// x--

				if (x + 2 < 8 && y + 1 < 8)
				{
					if (grid[x + 0][y + 1] == grid[x + 1][y + 0] && grid[x + 1][y + 0] == grid[x + 2][y + 0]) 
					{
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 1)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 0)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
					}
				}


				// x-x
				// -x-

				if (x + 2 < 8 && y + 1 < 8) 
				{
					if (grid[x + 0][y + 0] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 2][y + 0]) 
					{
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 1)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 1)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 1)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 0)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
					}
				}


				// xx-
				// --x

				if (x + 2 < 8 && y + 1 < 8) 
				{
					if (grid[x + 0][y + 0] == grid[x + 1][y + 0] && grid[x + 1][y + 0] == grid[x + 2][y + 1]) 
					{
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 2)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 1)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 2)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 0)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
					}
				}
				
				if(grid[x][y] == 8){
					int randomDir = random.nextInt(4);
					switch(randomDir){
					//-
					//h
					case 0:
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 0)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y - 1)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
						break;
					//h-
					case 1:
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 0)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 1)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 0)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
						break;
					//h
					//-
					case 2:
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 0)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 1)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
						break;
					//-h
					case 3:
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 1)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 0)));
						r.mousePress(InputEvent.BUTTON1_MASK);
						r.mouseMove(Bejeweled.originX + (Bejeweled.squareDimension * (x + 0)), Bejeweled.originY + (Bejeweled.squareDimension * (y + 0)));
						r.mouseRelease(InputEvent.BUTTON1_MASK);
						break;
					}
				}
			}
		}
	}
}
