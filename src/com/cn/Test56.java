package com.cn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: helisen
 * @Date 2022/6/23 17:45
 * @Description:
 */
public class Test56 {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();
        List<Integer> a = map.get("a");
        System.out.println(a == null || a.size() == 0);
    }
}
