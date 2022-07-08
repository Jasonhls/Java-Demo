package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: helisen
 * @Date 2022/5/10 15:29
 * @Description:
 */
public class Test16 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int maxPrice = Integer.parseInt(s1[0]);
        int num = Integer.parseInt(s1[1]);
        int[] a = new int[num];
        int[] b = new int[num];
        int[] c = new int[num];
        for (int i = 0; i < num; i++) {
            String s2 = br.readLine();
            String[] s3 = s2.split(" ");
            a[i] = Integer.parseInt(s3[0]);
            b[i] = Integer.parseInt(s3[1]);
            c[i] = Integer.parseInt(s3[2]);
        }
        int value = 0;
        for (int i = 0; i < a.length; i++) {
            if(c[i] != 0) {
                continue;
            }
            if(a[i] > maxPrice) {
                continue;
            }
            int maxValue = a[i] * b[i];
            int condition = a[i];
            for (int j = 0; j < a.length; j++) {
                if(c[j] != 0) {
                    continue;
                }
                if(j == i) {
                    continue;
                }
                //先判断
                if(condition + a[j] > maxPrice) {
                    continue;
                }
                int conditionTemp = condition + a[j];
                for (int k = 0; k < a.length; k++) {
                    if(c[k] == (j + 1)) {
                        conditionTemp = conditionTemp + a[k];
                    }
                }
                if(conditionTemp > maxPrice) {
                    continue;
                }
                //计算真实的
                maxValue = maxValue + a[j] * b[j];
                condition = condition + a[j];
                for (int k = 0; k < a.length; k++) {
                    if(c[k] == (j + 1)) {
                        condition = condition + a[k];
                        maxValue = maxValue + a[k] * b[k];
                    }
                }
            }
            if(maxValue > value) {
                value = maxValue;
            }
        }
        System.out.println(value);
    }

    /**
     * 排列组合 m里面取2个元素进行组合
     * @param m
     * @return
     */
    public static Set<Set<Integer>> getArrAssociationTwo(int m) {
        if(m == 2) {
            Set<Integer> set = new HashSet<>();
            set.add(1);
            set.add(2);
            Set<Set<Integer>> result = new HashSet<>();
            result.add(set);
            return result;
        }
        Set<Set<Integer>> arrAssociation = getArrAssociationTwo(m - 1);
        for (int i = 1; i < m; i++) {
            Set<Integer> set = new HashSet<>();
            set.add(i);
            set.add(m);
            arrAssociation.add(set);
        }
        return arrAssociation;
    }

    /**
     * 排列组合 m里面取num个元素进行组合
     * @param m
     * @param num
     * @return
     */
    public static Set<Set<Integer>> getArrAssociationByNum(int m, int num) {
        if(num == 2) {
            return getArrAssociationTwo(m);
        }
        Set<Set<Integer>> setByNum = getArrAssociationByNum(m, num - 1);
        Set<Set<Integer>> newResult = new HashSet<>();
        for (Set<Integer> set : setByNum) {
            for (int i = 1; i <= m; i++) {
                if(!set.contains(i)) {
                    Set<Integer> newSet = new HashSet<>(set);
                    newSet.add(i);
                    specialAdd(newResult, newSet);
                }
            }
        }
        return newResult;
    }

    public static void specialAdd(Set<Set<Integer>> res, Set<Integer> set) {
        for (Set<Integer> set1 : res) {
            if(set.containsAll(set1)) {
                return;
            }else {
                break;
            }
        }
        res.add(set);
    }
}
