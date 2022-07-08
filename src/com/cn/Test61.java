package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/6/20 14:00
 * @Description:
 */
public class Test61 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[1]);
        System.out.println(get(a, b));

    }

    public static int get(int a, int b) {
        //如果只有一个盘子，就一种放法，如果没有苹果，不管几个盘子，也都是一种放法
        if(b == 1 || a == 0) {
            return 1;
        }else if(b > a) {
            //如果盘子数量大于苹果数量，总有 a-b个盘子是空的，所以这种情况相当于a(a, a)
            return get(a, a);
        }else {
            //如果苹果数量大于盘子数量
            //第一种情况：每个盘子都放了苹果，这个时候放法跟每个盘子减去一个苹果的放法是一样的效果，即a(a - b, b)
            //第二种情况：有至少一个盘子是空的，效果相当于a(a, b - 1)
            return get(a, b - 1) + get(a - b, b);
        }

    }


}
