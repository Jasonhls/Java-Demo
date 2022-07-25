package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test0064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int num = Integer.parseInt(s1[0]);

        int[][] arr = new int[num][2];
        for (int i = 0; i < num; i++) {
            String[] s2 = br.readLine().split(" ");
            int x = Integer.parseInt(s2[0]);
            int y = Integer.parseInt(s2[1]);
            arr[i][0] = x;
            arr[i][1] = y;
        }

        int maxX = Integer.parseInt(s1[1]);
        int currentX = 0;
        int currentY = 0;
        int total = 0;

        for (int i = 0; i < num; i++) {
            int x = arr[i][0];
            int y = arr[i][1];
            if(currentY == 0 && y == 0) {
                continue;
            }
            total = total + Math.abs(currentY * (x - currentX));
            currentY = currentY + y;
            currentX = x;
        }
        total = total + Math.abs(currentY * (maxX - currentX));
        System.out.println(total);
    }
}
