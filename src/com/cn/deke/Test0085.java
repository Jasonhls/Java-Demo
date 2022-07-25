package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Test0085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        StringBuilder sb = new StringBuilder();
        //被选中
        String choose = "";
        //粘贴板
        String tab = "";
        for (int i = 0; i < s1.length; i++) {
            String s2 = s1[i];
            if(s2.equals("1")) {
                //如果有被选中，清空
                if(!choose.isEmpty()) {
                    sb.replace(0, choose.length(), "");
                    choose = "";
                }
                //拼接A
                sb.append("A");
            }else if(s2.equals("2")) {
                if(!choose.isEmpty()) {
                    tab = choose;
                }
            }else if(s2.equals("3")) {
                if(!choose.isEmpty()) {
                    tab = choose;
                    choose = "";
                    //因为选择只能全选，因此之前的所有的字母清空
                    sb.delete(0, sb.length());
                }
            }else if(s2.equals("4")) {
                //如果有选中的，将选中的替换为空串
                if(!choose.isEmpty()) {
                    sb.replace(0, choose.length(), "");
                    choose = "";
                }
                //拼接粘贴板上的
                sb.append(tab);
            }else if(s2.equals("5")) {
                //全选
                if(sb.length() != 0) {
                    choose = sb.toString();
                }
            }
        }
        System.out.println(sb.length());
    }
}
