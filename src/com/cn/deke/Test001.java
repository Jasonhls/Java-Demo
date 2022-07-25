package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int m = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = n; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                for (int k = j + 1; k < m + 1; k++) {
                    if(a(i, j) && a(j, k) && a(k, i) && i * i + j * j == k * k) {
                        count++;
                        System.out.printf("%d %d %d\n", i, j, k);
                    }
                }
            }
        }
        if(count == 0) {
            System.out.println("Na");
        }

    }

    public static boolean a(int a, int b) {
        int min = Math.min(a, b);
        double sqrt = Math.sqrt(min);
        for (int i = 2; i <= sqrt; i++) {
            if(a % i == 0 && b % i == 0) {
                return false;
            }
        }
        return true;
    }
}
