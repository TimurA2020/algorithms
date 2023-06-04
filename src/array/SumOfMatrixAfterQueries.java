package array;

import java.util.Arrays;

public class SumOfMatrixAfterQueries {


    //needs fixing
    public static long matrixSumQueries(int n, int[][] queries) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < queries.length; i++) {
            if(queries[i][0] == 0) {
                int index = queries[i][1];
                int value = queries[i][2];
                for(int j = 0; j < n; j++) {
                    matrix[index][j] = value;
                }
            } else if (queries[i][0] == 1) {
                int index = queries[i][1];
                int value = queries[i][2];
                for(int j = 0; j < n; j++) {
                    matrix[j][index] = value;
                }
            }
        }

        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
        }

        return sum;
    }
}
