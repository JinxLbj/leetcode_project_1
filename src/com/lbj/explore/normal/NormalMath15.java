/**
 * createby : JinxLbj
 * date : 2018/8/9
 * desc : 岛屿的个数
 **/

package com.lbj.explore.normal;

import java.util.ArrayList;
import java.util.List;

public class NormalMath15 {

    public static void main(String[] args) {
        System.out.println(new NormalMath15().numIslands(new char[][]{{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}})
        );
    }

    boolean[][] flag = null;

    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        flag = new boolean[grid.length][grid[0].length];
        int num = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (flag[i][j]) {
                    continue;
                }
                if(grid[i][j] == '1'){
                    search(grid, i, j);
                    num++;
                }
            }
        }
        return num;
    }

    private void search(char[][] grid, int i, int j) {
        flag[i][j] = true;
        if (i - 1 >= 0 && grid[i - 1][j] == '1' && !flag[i - 1][j]) {
            search(grid, i - 1, j);
        }
        if (i + 1 <= grid.length - 1 && grid[i + 1][j] == '1' && !flag[i + 1][j]){
            search(grid, i + 1, j);
        }
        if (j - 1 >= 0 && grid[i][j - 1] == '1' && !flag[i][j - 1]){
            search(grid, i, j - 1);
        }
        if (j + 1 <= grid[0].length - 1 && grid[i][j + 1] == '1' && !flag[i][j + 1]){
            search(grid, i, j + 1);
        }
    }
}
