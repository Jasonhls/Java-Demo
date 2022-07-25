package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test0074 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String str = s.replaceAll(",", "");
        //被一个0或多个0分割
        String[] split = str.split("[0]+");
        int count = 0;
        for (String car : split) {
            int len = car.length();
            while(len > 3) {
                count++;
                len -= 3;
            }
            //剩余长度小于等于3，如果想求能放车辆最小的情况，那么剩下长度只放一辆车
            if(len != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
