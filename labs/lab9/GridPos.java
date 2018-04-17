package lab9;

/**
 * A class to represent a row and column of a WUggle board.
 * For our game, the indexes will go from 0 to 3 inclusively in each direction,
 * But for generality no need to check for that here.
 * 
 * You can generate most of the methods of this class automatically by eclipse based
 *   on the two provided instance variables: row and col.
 *   
 * @author roncytron
 *
 */
public class GridPos {
	
	private final int row, col;

	public GridPos(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + col;
		result = prime * result + row;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GridPos other = (GridPos) obj;
		if (col != other.col)
			return false;
		if (row != other.row)
			return false;
		return true;
	}
	
	public GridPos downNeighbor() {
		return new GridPos(row+1,col);
	}
	
	public GridPos rightNeighbor() {
			return new GridPos(row,col+1);
	}

	@Override
	public String toString() {
		return "GridPos [row=" + row + ", col=" + col + "]";
	}
	
}