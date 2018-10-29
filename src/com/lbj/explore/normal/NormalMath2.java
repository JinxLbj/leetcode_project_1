/**
 * createby : lbj
 * date : 2018/8/1
 * desc :
 **/

package com.lbj.explore.normal;

import java.util.HashSet;
import java.util.Set;

public class NormalMath2 {

    public static void main(String[] args) {
        new NormalMath2().setZeroes(new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}});
    }

    public void setZeroes(int[][] matrix) {
        Set<Integer> setX = new HashSet<>();
        Set<Integer> setY = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    setX.add(i);
                    setY.add(j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(setX.contains(i) || setY.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void setZeroes1(int[][] matrix) {
        if(matrix.length==0){
            return;
        }
        boolean[] rows=new boolean[matrix.length];
        boolean[] columns=new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0) {
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(rows[i]||columns[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }

}
