package GhoulCatchersBot;

public class MoveFinder
{	
	public static Move findMove(int[][] grid)
	{
		int originSquareX;
		int originSquareY;
		int destinationSquareX;
		int destinationSquareY;

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
						originSquareX = x + 0;
						originSquareY = y + 0;
						destinationSquareX = x + 0;
						destinationSquareY = y + 1;
						return new Move(originSquareX, originSquareY, destinationSquareX, destinationSquareY);
					}
				}

				// - x
				// x
				// x
				if (x + 1 < 6 && y + 2 < 6)
				{
					if (grid[x + 1][y + 0] == grid[x + 0][y + 1] && grid[x + 0][y + 1] == grid[x + 0][y + 2])
					{
						originSquareX = x + 1;
						originSquareY = y + 0;
						destinationSquareX = x + 0;
						destinationSquareY = y + 0;
						return new Move(originSquareX, originSquareY, destinationSquareX, destinationSquareY);
					}
				}

				// x
				// - x
				// x
				if (x + 1 < 6 && y + 2 < 6) 
				{
					if (grid[x + 0][y + 0] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 0][y + 2])
					{
						originSquareX = x + 1;
						originSquareY = y + 1;
						destinationSquareX = x + 0;
						destinationSquareY = y + 1;
						return new Move(originSquareX, originSquareY, destinationSquareX, destinationSquareY);
					}
				}

				// x
				// x
				// - x
				if (x + 1 < 6 && y + 2 < 6) 
				{
					if (grid[x + 0][y + 0] == grid[x + 0][y + 1] && grid[x + 0][y + 1] == grid[x + 1][y + 2])
					{
						originSquareX = x + 1;
						originSquareY = y + 2;
						destinationSquareX = x + 0;
						destinationSquareY = y + 2;
						return new Move(originSquareX, originSquareY, destinationSquareX, destinationSquareY);
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
						originSquareX = x + 0;
						originSquareY = y + 3;
						destinationSquareX = x + 0;
						destinationSquareY = y + 2;
						return new Move(originSquareX, originSquareY, destinationSquareX, destinationSquareY);
					}
				}

				// x -
				//   x
				//   x
				if (x + 1 < 6 && y + 2 < 6)
				{
					if (grid[x + 0][y + 0] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 1][y + 2]) 
					{
						originSquareX = x + 0;
						originSquareY = y + 0;
						destinationSquareX = x + 1;
						destinationSquareY = y + 0;
						return new Move(originSquareX, originSquareY, destinationSquareX, destinationSquareY);
					}
				}

				//   x
				// x -
				//   x
				if (x + 1 < 6 && y + 2 < 6) 
				{
					if (grid[x + 1][y + 0] == grid[x + 0][y + 1] && grid[x + 0][y + 1] == grid[x + 1][y + 2]) 
					{
						originSquareX = x + 0;
						originSquareY = y + 1;
						destinationSquareX = x + 1;
						destinationSquareY = y + 1;
						return new Move(originSquareX, originSquareY, destinationSquareX, destinationSquareY);
					}
				}

				//   x
				//   x
				// x -
				if (x + 1 < 6 && y + 2 < 6) 
				{
					if (grid[x + 1][y + 0] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 0][y + 2]) 
					{
						originSquareX = x + 0;
						originSquareY = y + 2;
						destinationSquareX = x + 1;
						destinationSquareY = y + 2;
						return new Move(originSquareX, originSquareY, destinationSquareX, destinationSquareY);
					}
				}

				// xx-x
				if (x + 3 < 6) 
				{
					if (grid[x][y] == grid[x + 1][y] && grid[x + 1][y] == grid[x + 3][y]) 
					{
						originSquareX = x + 3;
						originSquareY = y;
						destinationSquareX = x + 2;
						destinationSquareY = y;
						return new Move(originSquareX, originSquareY, destinationSquareX, destinationSquareY);
					}
				}

				// x--
				// -xx
				if (x + 2 < 6 && y + 1 < 6)
				{
					if (grid[x][y] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 2][y + 1])
					{
						originSquareX = x + 0;
						originSquareY = y + 0;
						destinationSquareX = x + 0;
						destinationSquareY = y + 1;
						return new Move(originSquareX, originSquareY, destinationSquareX, destinationSquareY);
					}
				}

				// -x-
				// x-x
				if (x + 2 < 6 && y + 1 < 6) 
				{
					if (grid[x + 0][y + 1] == grid[x + 1][y + 0] && grid[x + 1][y + 0] == grid[x + 2][y + 1])
					{
						originSquareX = x + 1;
						originSquareY = y + 0;
						destinationSquareX = x + 1;
						destinationSquareY = y + 1;
						return new Move(originSquareX, originSquareY, destinationSquareX, destinationSquareY);
					}
				}

				// --x
				// xx-
				if (x + 2 < 6 && y + 1 < 6)
				{
					if (grid[x + 0][y + 1] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 2][y + 0])
					{
						originSquareX = x + 2;
						originSquareY = y + 0;
						destinationSquareX = x + 2;
						destinationSquareY = y + 1;
						return new Move(originSquareX, originSquareY, destinationSquareX, destinationSquareY);
					}
				}

				// x-xx
				if (x + 3 < 6) 
				{
					if (grid[x][y] == grid[x + 2][y] && grid[x + 2][y] == grid[x + 3][y])
					{
						originSquareX = x + 0;
						originSquareY = y;
						destinationSquareX = x + 1;
						destinationSquareY = y;
						return new Move(originSquareX, originSquareY, destinationSquareX, destinationSquareY);
					}
				}

				// -xx
				// x--
				if (x + 2 < 6 && y + 1 < 6)
				{
					if (grid[x + 0][y + 1] == grid[x + 1][y + 0] && grid[x + 1][y + 0] == grid[x + 2][y + 0]) 
					{
						originSquareX = x + 0;
						originSquareY = y + 1;
						destinationSquareX = x + 0;
						destinationSquareY = y + 0;
						return new Move(originSquareX, originSquareY, destinationSquareX, destinationSquareY);
					}
				}

				// x-x
				// -x-
				if (x + 2 < 6 && y + 1 < 6) 
				{
					if (grid[x + 0][y + 0] == grid[x + 1][y + 1] && grid[x + 1][y + 1] == grid[x + 2][y + 0]) 
					{
						originSquareX = x + 1;
						originSquareY = y + 1;
						destinationSquareX = x + 1;
						destinationSquareY = y + 0;
						return new Move(originSquareX, originSquareY, destinationSquareX, destinationSquareY);
					}
				}

				// xx-
				// --x
				if (x + 2 < 6 && y + 1 < 6) 
				{
					if (grid[x + 0][y + 0] == grid[x + 1][y + 0] && grid[x + 1][y + 0] == grid[x + 2][y + 1]) 
					{
						originSquareX = x + 2;
						originSquareY = y + 1;
						destinationSquareX = x + 2;
						destinationSquareY = y + 0;
						return new Move(originSquareX, originSquareY, destinationSquareX, destinationSquareY);
					}
				}
			}
		}		
		return null;
	}
}
