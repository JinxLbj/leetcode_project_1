/**
 * createby : lbj
 * date : 2018/8/1
 * desc :
 **/

package com.lbj.explore.normal;

import java.lang.reflect.Array;
import java.util.*;

public class NormalMath3 {

    public static void main(String[] args) {
        new NormalMath3().groupAnagrams(new String[]{"",""});
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        if(len == 0){
            return new ArrayList<>();
        }
        List<List<String>> lists = new ArrayList<>();
        Map<String, List<String>> stringStringMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String newstr = new String(chars);
            List<String> mapList = stringStringMap.get(newstr);
            if (mapList != null) {
                mapList.add(strs[i]);
            }else{
                mapList = new ArrayList<>();
                mapList.add(strs[i]);
                stringStringMap.put(newstr, mapList);
            }
        }
        stringStringMap.forEach((k,v)-> lists.add(v));
        return  lists;
    }
}
