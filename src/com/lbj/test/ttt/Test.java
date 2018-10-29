/**
 * createby : JinxLbj
 * date : 2018/8/16
 * desc : 测试
 **/

package com.lbj.test.ttt;

import java.util.*;

class P{
    public void work(){
        System.out.println("P");
    }
}

class C extends P{
    @Override
    public void work(){
        System.out.println("C");
    }
}

public class Test {

    public static void main(String[] args) {
        P p = new C();
        p.work();
        System.out.println(p.getClass());
    }




}
