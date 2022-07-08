package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/6/20 14:00
 * @Description:
 */
public class Test64 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s2 = br.readLine();
        int num = Integer.parseInt(s);
        char[] chars = s2.toCharArray();
        int index = 1;
        int currentPage = 1;
        if(num <= 4) {
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if(c == 'U') {
                    index--;
                    if(index <= 0) {
                        index = num;
                    }
                }else if(c == 'D') {
                    index++;
                    if(index > num) {
                        index = 1;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= num; i++) {
                sb.append(i).append(" ");
            }
            System.out.println(sb);
            System.out.println(index);
        }else {
            int totalPage = num - 4 + 1;
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if(c == 'U') {
                    index--;
                    if(index <= 0) {
                        index = num;
                        currentPage = totalPage;
                    }else {
                        if(currentPage > index) {
                            currentPage--;
                        }
                    }
                }else if(c == 'D') {
                    index++;
                    if(index > num) {
                        index = 1;
                        currentPage = 1;
                    }else {
                        if(index > currentPage + 3) {
                            currentPage++;
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = currentPage; i < currentPage + 4; i++) {
                sb.append(i).append(" ");
            }
            System.out.println(sb);
            System.out.println(index);
        }
    }


}
