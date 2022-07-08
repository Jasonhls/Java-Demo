package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/5/30 13:36
 * @Description:
 */
public class Test33 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ipStr = br.readLine();
        String intStr = br.readLine();

        String[] split = ipStr.split("\\.");
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            String s = Integer.toBinaryString(Integer.parseInt(split[i]));
            if(s.length() < 8) {
                StringBuilder sb = new StringBuilder();
                sb.append("00000000").append(s);
                String s1 = sb.toString();
                s = s1.substring(s1.length() - 8);
            }
            ss.append(s);
        }
        //将二进制转换为十进制，radix为2表示入参为二进制，结果是十进制
        Long i = Long.parseLong(ss.toString(), 2);
        System.out.println(i);

        String intS = Long.toBinaryString(Long.parseLong(intStr));

        if(intS.length() < 32) {
            StringBuilder s2 = new StringBuilder();
            s2.append("00000000000000000000000000000000").append(intS);
            String str = s2.toString();
            intS = str.substring(str.length() - 32);
        }
        String ss1 = intS.substring(0, 8);
        String ss2 = intS.substring(8, 16);
        String ss3 = intS.substring(16, 24);
        String ss4 = intS.substring(24, 32);
        StringBuilder res = new StringBuilder();
        res.append(Integer.parseInt(ss1, 2)).append(".").append(Integer.parseInt(ss2, 2)).append(".")
                .append(Integer.parseInt(ss3, 2)).append(".").append(Integer.parseInt(ss4, 2));
        System.out.println(res);
    }

}
