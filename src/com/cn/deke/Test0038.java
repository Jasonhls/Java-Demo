package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test0038 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split(",");
        if(split.length == 0) {
            System.out.println("/");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(split[0]).append("/").append(split[1]);
        //替换一个或多个的/号为一个/号
        String str = sb.toString().replaceAll("/+", "/");
        System.out.println(str);

    }
}
