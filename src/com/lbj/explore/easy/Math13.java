/**
 * createby : lbj
 * date : 2018/7/23
 * desc :
 **/

package com.lbj.explore.easy;

public class Math13 {

    public static void main(String[] args) {
        int i = reverse(-2147483648);
        System.out.println(i);
    }

    //咸鱼方法
    public static int reverse(int x) {
        if( x == 0){
            return x;
        }
        String number = String.valueOf(x);
        char[] chars = null;
        if(number.startsWith("-")){
            number = number.substring(1, number.length());
            chars = number.toCharArray();
            int length = chars.length;
            for (int i = 0; i < length / 2; i++) {
                char t = chars[i];
                chars[i] = chars[length - 1 - i];
                chars[length - 1 - i] = t;
            }
            int zero = 0;
            for(int i = 0 ; i < length ; i++){
                if(chars[i] != '0'){
                    break;
                }
                zero++;
            }
            char[] result = new char[length - zero];
            System.arraycopy(chars,zero,result,0,length - zero);
            long longNumber = Long.valueOf(new String(result));
            if(longNumber > 2147483647L){
                return 0;
            }
            return Integer.valueOf("-" + new String(result));
        }else{
            chars = number.toCharArray();
            int length = chars.length;
            for (int i = 0; i < length / 2; i++) {
                char t = chars[i];
                chars[i] = chars[length - 1 - i];
                chars[length - 1 - i] = t;
            }
            int zero = 0;
            for(int i = 0 ; i < length ; i++){
                if(chars[i] != '0'){
                    break;
                }
                zero++;
            }
            char[] result = new char[length - zero];
            System.arraycopy(chars,zero,result,0,length - zero);
            long longNumber = Long.valueOf( new String(result));
            if(longNumber > 2147483648L){
                return 0;
            }
            return Integer.valueOf(new String(result));
        }
    }

    //碉堡方法
    public static int reverse1(int x) {
        int abs = Math.abs(x);
        int out = 0;
        while (abs > 0){
            if (out > Integer.MAX_VALUE / 10){
                return 0;
            }
            out *= 10;
            out += abs % 10;
            abs /= 10;
        }
        if (x < 0){
            out = - out;
        }
        return out;
    }
}
