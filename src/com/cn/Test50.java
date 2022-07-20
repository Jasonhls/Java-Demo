package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @Author: helisen
 * @Date 2022/6/27 12:24
 * @Description:
 */
public class Test50 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        int num1 = 0;
        int o1 = 1;
        int num2 = 1;
        int o2 = 1;

        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

        }

    }

    public static int cal(int right, int left, char c) {
        if('+' == c) {
            return left + right;
        }else if('-' == c) {
            return left - right;
        }else if('*' == c) {
            return left * right;
        }else if('/' == c) {
            return left / right;
        }
        return 0;
    }
}
