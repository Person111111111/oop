// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
    public int charArea(char ch) {
        int top = grid.length, bottom = -1;
        int left = grid[0].length, right = -1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == ch) {
                    if (i < top) top = i;
                    if (i > bottom) bottom = i;
                    if (j < left) left = j;
                    if (j > right) right = j;
                }
            }
        }
        return (bottom - top + 1) * (right - left + 1);
    }
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
    // Define a method to count the total number of crosses.
    public int countPlus() {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != ' ') { // ô hợp lệ
                    int arm = minArmLength(i, j);
                    if (arm >= 2) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // Counting branch length in 1 direction from (i,j).
    private int countDirection(int row, int col, int dRow, int dCol) {
        char ch = grid[row][col];
        int length = 0;
        row += dRow;
        col += dCol;

        while (row >= 0 && row < grid.length && col >= 0 && col < grid[row].length && grid[row][col] == ch) {
            length++;
            row += dRow;
            col += dCol;
        }
        return length;
    }

    // The length of the shortest branch.
    private int minArmLength(int i, int j){
            int up = countDirection(i, j, -1, 0);
            int down = countDirection(i, j, 1, 0);
            int left = countDirection(i, j, 0, -1);
            int right = countDirection(i, j, 0, 1);
            return Math.min(Math.min(up, down), Math.min(left, right));
    }
}
