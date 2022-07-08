package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author: helisen
 * @Date 2022/6/27 12:24
 * @Description:
 */
public class Test66 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = br.readLine();
            if(s == null || s == "") {
                break;
            }
            String[] s1 = s.split(" ");
            String result = null;
            if(s1.length == 1) {
                if("reset".startsWith(s1[0])) {
                    System.out.println("reset what");
                }else {
                    System.out.println("unknown command");
                }
            }else if(s1.length == 2) {
                int n = 0;
                if("reset".startsWith(s1[0]) && "board".startsWith(s1[1])) {
                    n++;
                    result = "board fault";
                }
                if("board".startsWith(s1[0]) && "add".startsWith(s1[1])) {
                    n++;
                    result = "where to add";
                }
                if("board".startsWith(s1[0]) && "delete".startsWith(s1[1])) {
                    n++;
                    result = "no board at all";
                }
                if("reboot".startsWith(s1[0]) && "backplane".startsWith(s1[1])) {
                    n++;
                    result = "impossible";
                }
                if("backplane".startsWith(s1[0]) && "abort".startsWith(s1[1])) {
                    n++;
                    result = "install first";
                }
                if(n != 1) {
                    System.out.println("unknown command");
                }else {
                    System.out.println(result);
                }
            }
        }
    }
}
