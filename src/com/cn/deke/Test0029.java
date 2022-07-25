package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Test0029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        //  \W是字母，这里有两个\是因为在java中\是转义字符
        // +号是出现一次或多次  *号是出现零次或多次
        String[] split = s.split("\\W+");
        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList(split));
        String pre = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (String word : treeSet) {
            if(word.startsWith(pre)) {
                sb.append(word).append(" ");
            }
        }
        if(sb.length() == 0) {
            sb.append(pre);
        }
        System.out.println(sb.toString().trim());
    }
}
