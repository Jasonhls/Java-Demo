package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @Author: helisen
 * @Date 2022/5/10 15:29
 * @Description:
 */
public class Test21 {
    //1 0 1 0 0 2 1
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList();
        while(true) {
            String str = br.readLine();
            if(str == null) {
                break;
            }
            str = str.trim();
            if(str.equals("")) {
                break;
            }
            list.add(str);
        }
        for(int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            //长度不超过8
            if(str.length() <= 8) {
                System.out.println("NG");
                continue;
            }
            char[] chars = str.toCharArray();
            Set<Integer> ss = new HashSet<>();
            for (char ch : chars) {
                if(ch > 'a' && ch < 'z') {
                    ss.add(1);
                }
                else if(ch > 'A' && ch < 'Z') {
                    ss.add(2);
                }
                else if(ch >= '0' && ch <= '9') {
                    ss.add(3);
                }else {
                    ss.add(4);
                }
            }
            if(ss.size() < 3) {
                System.out.println("NG");
                continue;
            }
            //含有至少两个及以上重复的片段
            Set<String> set = new HashSet<>();
            Boolean b = false;
            for (int j = 0; j < str.length() - 4; j++) {
                String subStr = str.substring(j, j + 3);
                if(set.contains(subStr)) {
                    System.out.println("NG");
                    b = true;
                    break;
                }else {
                    set.add(subStr);
                }
            }
            if(b) {
                continue;
            }
            System.out.println("OK");
        }
    }

}
