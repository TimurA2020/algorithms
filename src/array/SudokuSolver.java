package array;

public class SudokuSolver {
    public void solveSudoku(char[][] board) {

        solveBoard(board);
    }

    private boolean existsInRow(char[][] board, char target, int row) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == target) {
                return true;
            }
        }

        return false;
    }

    private boolean existsInColumn(char[][] board, char target, int column) {
        for (int i = 0; i < 9; i++) {
            if (board[i][column] == target) {
                return true;
            }
        }
        return false;
    }

    private boolean existsInBox(char[][] board, char target, int row, int column) {
        int startingHorizontalPosition = row - (row % 3);
        int startingVerticalPosition = column - (column % 3);

        for (int i = startingVerticalPosition; i < startingHorizontalPosition + 3; i++) {
            for (int j = startingHorizontalPosition; j < startingVerticalPosition + 3; j++) {
                if (board[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isValidPosition(char[][] board, char target, int row, int column) {
        return !existsInRow(board, target, row) && !existsInColumn(board, target, column) && !existsInBox(board, target, row, column);
    }

    private boolean solveBoard(char[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                if(board[row][column] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValidPosition(board, num, row, column)) {
                            board[row][column] = num;

                            if(solveBoard(board)) {
                                return true;
                            } else {
                                board[row][column] = '.';
                            }
                        }
                    }

                    return false;
                }
            }
        }
        return true;
    }
}
