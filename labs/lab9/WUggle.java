package lab9;

import java.util.ArrayList;
import java.util.List;

public class WUggle {
	
	
	/**
	 * A WUggle game
	 * @param grid a 4x4 array of Strings.
	 * The string at row r, 0 <= r < 4 and column c, 0 <= c < 4
	 *   is stored at grid[r][c]
	 */
	private String[][] grid;
	private String word;
	public WUggle(String[][] grid) {
		// FIXME
		this.grid=grid;
		this.word="";
	}
			
	/**
	 * 
	 * @param row the starting row of the String we seek
	 * @param col the starting column of the String we seek
	 * @param length the length of the String we seek
	 * @return the String of the supplied length that occurs in the grid horizontally, starting at the specified row and column
	 */
	public String horizontalWordAtRow(GridPos gp, int length) {
		
		for(int i=0;i<length;++i) {
			this.word = this.word + this.grid[gp.getRow()][gp.getCol()+i];
		}
		
		return this.word; // FIXME
		
	}
	
	/**
	 * 
	 * @param gp
	 * @param length
	 * @return vertical Word At Column
	 */
	public String verticalWordAtColumn(GridPos gp, int length) {
		for(int i=0;i<length;++i) {
			this.word = this.word + this.grid[gp.getRow()+i][gp.getCol()];
		}
		
		return this.word; // FIXME
	}

}