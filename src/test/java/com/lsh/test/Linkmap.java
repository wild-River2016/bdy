package com.lsh.test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName Linkmap
 * @Description: TODO
 * @Author lsh
 * @Date 2019/6/17 13:30
 * @Version
 */
public class Linkmap {

    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>(3);
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");

        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.print(e.getKey() + " : " + e.getValue() + "\t");
        }
        map.put("4", "4");
        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.print(e.getKey() + " : " + e.getValue() + "\t");
        }

    }
}
