package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test0042 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split(",");
        Integer value = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split("-");
            Integer start = Integer.parseInt(split1[0]);
            Integer end = start;
            if(split1.length > 1) {
                end = Integer.parseInt(split1[1]);
            }
            for (int j = start; j <= end; j++) {
                list.add(j);
            }
        }
        list.sort(Integer::compareTo);


        list.remove(value);
        if(list.size() == 0) {
            System.out.println();
            return;
        }

        StringBuilder sb = new StringBuilder();
        int last = list.get(0);
        sb.append(last);
        boolean x = false;
        for (int i = 1; i < list.size(); i++) {
            Integer a = list.get(i);
            if(a == last + 1) {
                x = true;
                last = a;
                if(i == list.size() - 1) {
                    sb.append("-").append(a);
                    break;
                }
                continue;
            }else {
                if(x) {
                    sb.append("-").append(last);
                    x = false;
                }
                sb.append(",").append(a);
                last = a;
            }
        }
        System.out.println(sb.toString());


    }
}
