package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: helisen
 * @Date 2022/5/10 15:29
 * @Description:
 */
public class Test22 {
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

            char[] chars = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char ch : chars) {
                if(ch >= '0' && ch <= '9') {
                    sb.append(ch);
                }else if(ch >= 'a' && ch <= 'c') {
                    sb.append(2);
                }else if(ch >= 'd' && ch <= 'f') {
                    sb.append(3);
                }else if(ch >= 'g' && ch <= 'i') {
                    sb.append(4);
                }else if(ch >= 'j' && ch <= 'l') {
                    sb.append(5);
                }else if(ch >= 'm' && ch <= 'o') {
                    sb.append(6);
                }else if(ch >= 'p' && ch <= 's') {
                    sb.append(7);
                }else if(ch >= 't' && ch <= 'v') {
                    sb.append(8);
                }else if(ch >= 'w' && ch <= 'z') {
                    sb.append(9);
                }

                if(ch >= 'A' && ch <= 'Z') {
                    if(ch == 'z') {
                        sb.append("a");
                    }else {
                        sb.append(ch + 33);
                    }
                }
            }
            System.out.println(sb);
        }
    }

}
