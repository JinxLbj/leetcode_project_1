/**
 * createby : lbj
 * date : 2018/8/5
 * desc :
 **/

package com.lbj.test.data20180805;

public class Exam4 {

    private String a;
    private String b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public static void change(Exam4 exam4){
        exam4.setA("a");
        exam4.setB("b");
    }

    @Override
    public String toString() {
        return "Exam4{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Exam4 exam4 = new Exam4();
        exam4.setA("A");
        exam4.setB("B");
        System.out.println(exam4);
        change(exam4);
        System.out.println(exam4);
    }
}
