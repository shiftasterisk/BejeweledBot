package GhoulCatchersBot;

public class Move {
	public int originSquareX;
	public int originSquareY;
	public int destinationSquareX;
	public int destinationSquareY;

	public Move(int originSquareX, int originSquareY, int destinationSquareX, int destinationSquareY) {
		this.originSquareX = originSquareX;
		this.originSquareY = originSquareY;
		this.destinationSquareX = destinationSquareX;
		this.destinationSquareY = destinationSquareY;
	}
}
