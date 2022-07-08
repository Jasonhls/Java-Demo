package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: helisen
 * @Date 2022/5/30 13:36
 * @Description:
 */
public class Test36 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String str = br.readLine();
        LinkedHashMap<Character, Character> map = new LinkedHashMap(26);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            if(!map.containsValue(c)) {
               map.put((char)(map.size() + 65), c);
            }
        }
        for (int i = 65; i <= 90; i++) {
            char c = (char)i;
            if(!map.containsValue(c)) {
                map.put((char)(map.size() + 65), c);
            }
        }


        char[] chars1 = str.toCharArray();

        for (int i = 0; i < chars1.length; i++) {
            char c = chars1[i];
            if(c >= 'a' && c <= 'z') {
                char cc = (char)(c - 32);
                if(map.containsKey(cc)) {
                    chars1[i] = (char) (map.get(cc) + 32);
                }
            }else {
                if(map.containsKey(c)) {
                    chars1[i] = map.get(c);
                }
            }
        }
        System.out.println(chars1);
    }
}