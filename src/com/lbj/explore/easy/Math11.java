/**
 * createby : lbj
 * date : 2018/7/23
 * desc :
 **/

package com.lbj.explore.easy;

public class Math11 {

    private static int length = 0;

    public static void main(String[] args) {
        rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }

    public static void rotate(int[][] matrix) {
        length = matrix.length;
        for (int i = 0; i < (length - 1) / 2; i++) {
            for (int j = i; j < length - 1 - i; j++) {
                exchange(matrix, i, j, j, length - i - 1);
                exchange(matrix, i, j, length - i - 1, length - j - 1);
                exchange(matrix, i, j, length - j - 1, i);
            }
        }
    }

    public static void exchange(int[][] matrix, int i, int j, int x, int y) {
        int t = matrix[i][j];
        matrix[i][j] = matrix[x][y];
        matrix[x][y] = t;
    }
}
