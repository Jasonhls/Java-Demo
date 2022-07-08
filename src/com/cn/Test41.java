package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: helisen
 * @Date 2022/6/2 15:08
 * @Description:
 */
public class Test41 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        int num = Integer.parseInt(s1);

        String s2 = br.readLine();
        String[] arr1 = s2.split(" ");

        String s3 = br.readLine();
        String[] arr2 = s3.split(" ");

        Set<Integer> set = new HashSet<>();
        set.add(0);
        for (int j = 0; j < num; j++) {
            //个数
            Integer value = Integer.parseInt(arr1[j]);
            int number = Integer.parseInt(arr2[j]);
            List<Integer> oldList = new ArrayList<>(set);
            for (int k = 0; k < number; k++) {
                //把已经添加到set中的集合取出来遍历
                for (int i = 0; i < oldList.size(); i++) {
                    int newValue = oldList.get(i) + value * (k + 1);
                    set.add(newValue);
                }
            }
        }
        System.out.println(set.size());
    }
}
