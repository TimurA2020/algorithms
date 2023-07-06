package array;

import linkedlist.ListNode;

import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {
    public boolean isValidSudoku(char[][] board) {
        Set<String> hashSet = new HashSet<>();
        int numCount = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] != '.')
                    if(!hashSet.add(board[i][j] + "row " + i) ||
                            !hashSet.add(board[i][j] + "column" + j) ||
                            !hashSet.add(board[i][j] + "subbox row" + j/3 + "column " + i/3)) {
                        return false;
                    }

            }
        }

        return true;
    }
}
