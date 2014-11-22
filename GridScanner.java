public class GridScanner{

	static Snapshotter ss = new Snapshotter();
	
	public static void scan(int[][] grid) throws Exception 
	{
		int color = 0;
		int blank = 0;

		ss.takeBoardScreenshot();

		for (int y = 0; y < grid[0].length; y++)
		{
			for (int x = 0; x < grid.length; x++)
			{
				color = ss.getpixcolor((Bejeweled.squareDimension * x), Bejeweled.squareDimension * y);


				if (color == Colors.white.colorNum || color == Colors.whitefire.colorNum || color == Colors.whiteSpark.colorNum || color == Colors.whiteMulti.colorNum || color == Colors.whiteMulti2.colorNum) 
				{
					grid[x][y] = 1;
					continue;
				}

				if (color == Colors.red.colorNum || color == Colors.redfire.colorNum || color == Colors.redSpark.colorNum || color == Colors.redMulti.colorNum || color == Colors.redMulti2.colorNum) 
				{
					grid[x][y] = 2;
					continue;
				}

				if (color == Colors.orange.colorNum || color == Colors.orangefire.colorNum || color == Colors.orangeSpark.colorNum || color == Colors.orangeMulti.colorNum) 
				{
					grid[x][y] = 3;
					continue;
				}

				if (color == Colors.yellow.colorNum || color == Colors.yellowfire.colorNum || color == Colors.yellowSpark.colorNum || color == Colors.yellowMulti.colorNum || color == Colors.yellowcoin.colorNum) 
				{
					grid[x][y] = 4;
					continue;
				}

				if (color == Colors.purple.colorNum || color == Colors.purplefire.colorNum || color == Colors.purpleSpark.colorNum || color == Colors.purpleMulti.colorNum || color == Colors.purpleMulti2.colorNum || color == Colors.purpleMulti3.colorNum) 
				{
					grid[x][y] = 5;
					continue;
				}

				if (color == Colors.blue.colorNum || color == Colors.bluefire.colorNum || color == Colors.blueSpark.colorNum || color == Colors.blueMulti.colorNum || color == Colors.blueMulti2.colorNum)
				{
					grid[x][y] = 6;
					continue;
				}
				if (color == Colors.green.colorNum || color == Colors.greenfire.colorNum || color == Colors.greenSpark.colorNum || color == Colors.greenMulti.colorNum || color == Colors.greenMulti2.colorNum  || color == Colors.greenMulti2.colorNum || color == Colors.greenMulti3.colorNum)
				{
					grid[x][y] = 7;
					continue;
				}
				if (color == Colors.hypercube.colorNum || color == Colors.hypercube2.colorNum || color == Colors.hypercube3.colorNum){
					//Thread.sleep(100000);
					grid[x][y] = 8;
					continue;
				}
				
				blank += 1;
				grid[x][y] = color + blank;

			}
		}
	}
}