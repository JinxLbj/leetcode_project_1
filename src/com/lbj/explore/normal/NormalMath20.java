/**
 * createby : JinxLbj
 * date : 2018/8/14
 * desc : 单词搜索
 **/

package com.lbj.explore.normal;

import java.util.Arrays;
import java.util.Date;

public class NormalMath20 {

    public static void main(String[] args) {
        System.out.println(new NormalMath20().exist(new char[][]{{'a'}},
                "ab"));
    }

    private static boolean exist = false;

    public boolean exist(char[][] board, String word) {

        boolean[][] flag = new boolean[board.length][board[0].length];
        char[] chars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == chars[0]) {
                    if(chars.length == 1){
                        return true;
                    }
                    judge(board, i, j, chars, 1, flag);
                    if (exist) {
                        return true;
                    } else {
                        flag = new boolean[board.length][board[0].length];
                    }
                }
            }
        }
        return false;
    }

    private void judge(char[][] board, int i, int j, char[] chars, int index, boolean[][] booleans) {
        if (i - 1 >= 0 && board[i - 1][j] == chars[index] && !booleans[i - 1][j]) {
            boolean[][] booleans1 = Arrays.copyOf(booleans, booleans.length);
            booleans1[i][j] = true;
            if (chars.length - 1 == index) {
                exist = true;
            } else {
                judge(board, i - 1, j, chars, index + 1, booleans1);
            }
        }
        if (i + 1 < board.length && board[i + 1][j] == chars[index] && !booleans[i + 1][j]) {
            boolean[][] booleans1 = Arrays.copyOf(booleans, booleans.length);
            booleans1[i][j] = true;
            if (chars.length - 1 == index) {
                exist = true;
            } else {
                judge(board, i + 1, j, chars, index + 1, booleans1);
            }
        }
        if (j - 1 >= 0 && board[i][j - 1] == chars[index] && !booleans[i][j - 1]) {
            boolean[][] booleans1 = Arrays.copyOf(booleans, booleans.length);
            booleans1[i][j] = true;
            if (chars.length - 1 == index) {
                exist = true;
            } else {
                judge(board, i, j - 1, chars, index + 1, booleans1);
            }
        }
        if (j + 1 < board[0].length && board[i][j + 1] == chars[index] && !booleans[i][j + 1]) {
            boolean[][] booleans1 = Arrays.copyOf(booleans, booleans.length);
            booleans1[i][j] = true;
            if (chars.length - 1 == index) {
                exist = true;
            } else {
                judge(board, i, j + 1, chars, index + 1, booleans1);
            }
        }
    }



    //自己的方法不知道为什么无法使用，此方法原理相同可以运行
    public boolean exist1(char[][] board, String word) {
        if(board.length == 0) return false;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                // 从i,j点作为起点开始搜索
                boolean isExisted = search(board, i, j, word, 0);
                if(isExisted) return true;
            }
        }
        return false;
    }

    private boolean search(char[][] board, int i, int j, String word, int idx){
        if(idx >= word.length()) return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(idx)) return false;
        // 将已经搜索过的字母标记一下，防止循环。只要变成另外一个字符，就不会再有循环了。
        board[i][j] ^= 255;
        boolean res = search(board, i-1, j, word, idx+1) || search(board, i+1, j, word, idx+1) || search(board, i, j-1, word, idx+1) || search(board, i, j+1, word, idx+1);
        // 再次异或255就能恢复成原来的字母
        board[i][j] ^= 255;
        return res;
    }
}
