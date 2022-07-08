package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @Author: helisen
 * @Date 2022/6/16 13:43
 * @Description:
 */
public class Test94 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        String s1 = br.readLine();
        String[] goal = s1.split(" ");
        String s2 = br.readLine();
        int peopleNum = Integer.parseInt(s2);
        String s3 = br.readLine();
        String[] peopleArr = s3.split(" ");
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>(num);
        for (int i = 0; i < num; i++) {
            map.put(goal[i], 0);
        }
        int invalidNum = 0;
        for (int i = 0; i < peopleNum; i++) {
            if(map.containsKey(peopleArr[i])) {
                map.put(peopleArr[i], map.get(peopleArr[i]) + 1);
            }else {
                invalidNum++;
            }
        }

        for (int i = 0; i < num; i++) {
            sb.append(goal[i]).append(" ").append(":").append(" ").append(map.get(goal[i])).append("\r\n");
        }
        sb.append("Invalid : ").append(invalidNum);
        System.out.println(sb);
    }
}
