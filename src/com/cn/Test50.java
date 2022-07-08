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


        Stack<Integer> numStack = new Stack<>();
        Stack<Character> opeStack = new Stack<>();
        char[] arr = s.toCharArray();

        //当前处理的是否为数字
        boolean isDigit = false;
        //当前正在读取的数字
        int num = 0;
        //记录当前字符的上一个字符
        char pre = '0';
        //正负数标记
        int positiveFlag = 1;
        for (char c : arr) {
            //如果当前是数字字符
            if(Character.isDigit(c)) {
                num = num * 10 + Integer.valueOf(c + "");
                isDigit = true;
            }else {
                //如果当前字符为减号，且上一个字符不是右括号或者数字字符，则当前字符一定表示负数符号
                if('-' == c && !isDigit && pre != ']' && pre != '}') {
                    positiveFlag = -1;
                    continue;
                }

                //将当前字符记录
                pre = c;
                //如果当前字符之前的为数字字符，则将之前处理的数字入数字栈
                if(isDigit) {
                    numStack.push(num * positiveFlag);
                    //将相关标志重置
                    num = 0;
                    positiveFlag = 1;
                    isDigit = false;
                }
            }
        }

    }
}
