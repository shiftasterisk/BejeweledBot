package GhoulCatchersBot;

public class GridScanner{

	static Snapshotter ss = new Snapshotter();
	
	public static boolean checkWin() throws Exception {
		ss.takeReplayButtonScreenshot();
		return ss.isGameWon();
	}
	
	public static void scan(int[][] grid) throws Exception 
	{	
		ss.takeBoardScreenshot();
		int color;
		int invalidColor = 7;
		
		
		for (int y = 0; y < grid[0].length; y++)
		{
			for (int x = 0; x < grid.length; x++)
			{
				color = ss.getGhoulColor(x, y);
				if(color != 0)
					grid[x][y] = color;
				else
					grid[x][y] = invalidColor;
				invalidColor++;
				continue;
			}
		}
	}
}