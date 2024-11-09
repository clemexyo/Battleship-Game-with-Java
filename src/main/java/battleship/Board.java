package battleship;

import java.util.Arrays;

public class Board {
  private char[][] grid;

  public Board(int size) {
    grid = new char[size][size];
    initializeBoard();
  }

  public Board(int size1, int size2) {
    grid = new char[size1][size2];
    initializeBoard();
  }

  public void printBoard() {
    System.out.print("  ");
    for (int i = 1; i <= grid.length; i++) {
      System.out.printf("%-2d", i);
    }
    System.out.println();
    for(int row = 0; row < grid.length; row++) {
      System.out.printf("%c ", (char)('A' + row));
      for(int col = 0; col < grid[row].length; col++) {
        System.out.printf("%-2c", grid[row][col]);
      }
      System.out.println();
    }
  }

  private void initializeBoard() {
    for (char[] row : grid) {
      Arrays.fill(row, '~');
    }
  }
}
