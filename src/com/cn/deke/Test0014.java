package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test0014 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int startIndex = Integer.parseInt(s);
        int num = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            list.add(br.readLine());
        }
        String a = list.get(startIndex);

        StringBuilder sb = new StringBuilder(a);
        Set<Integer> set = new HashSet<>();
        set.add(startIndex);
        char c = a.charAt(a.length() - 1);
        while(true) {
            String use = null;
            int aa = -1;
            for (int i = 0; i < list.size(); i++) {
                if(set.contains(i)) {
                    continue;
                }
                String current = list.get(i);
                if(current.charAt(0) == c) {
                    if(use == null || current.length() > use.length()) {
                        use = current;
                        aa = i;
                    }else if(current.length() == use.length()) {
                        if(a(current, use)) {
                            use = current;
                            aa = i;
                        }
                    }
                }
            }
            if(use != null) {
                sb.append(use);
                set.add(aa);
                c = use.charAt(use.length() - 1);
            }else {
                break;
            }
        }
        System.out.println(sb);
    }

    public static boolean a(String a, String b) {
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] < arr2[i]) {
                return true;
            }
        }
        return false;
    }
}
