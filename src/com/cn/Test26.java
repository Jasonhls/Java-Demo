package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: helisen
 * @Date 2022/5/10 15:29
 * @Description:
 */
public class Test26 {
    //1 0 1 0 0 2 1
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList();
        while(true) {
            String str = br.readLine();
            if(str == null) {
                break;
            }
            str = str.trim();
            if(str.equals("")) {
                break;
            }
            list.add(str);
        }
        for(int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            char[] chars = str.toCharArray();
            int realNum = 0;
            for (int m = 0; m < chars.length; m++) {
                char a = chars[m];
                if(!(a >= 'a' && a <= 'z' || (a >= 'A' && a <= 'Z'))) {
                    continue;
                }
                int maxIndex = -1;
                for (int n = 0; n < chars.length - realNum - 1; n++) {
                    char b = chars[n];
                    if(!(b >= 'a' && b <= 'z' || (b >= 'A' && b <= 'Z'))) {
                        continue;
                    }
                    int mm = n + 1;
                    boolean continueFlag = false;
                    while(!(chars[mm] >= 'a' && chars[mm] <= 'z' || (chars[mm] >= 'A' && chars[mm] <= 'Z'))) {
                        if(mm >= chars.length - realNum - 1) {
                            continueFlag = true;
                            break;
                        }
                        mm++;
                    }
                    if(continueFlag) {
                        continue;
                    }
                    if(compare(chars[n], chars[mm]) > 0) {
                        char temp = chars[n];
                        chars[n] = chars[mm];
                        chars[mm] = temp;
                        maxIndex = mm;
                    }
                }
                if(maxIndex != -1) {
                    realNum = chars.length - maxIndex;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < chars.length; k++) {
                sb.append(chars[k]);
            }
            System.out.println(sb);
        }
    }

    private static int compare(char a, char b) {
        if(a >= 'a' && a <= 'z') {
            if(b >= 'a' && b <= 'z') {
                if(a > b) {
                    return 1;
                }else if(a < b) {
                    return -1;
                }else {
                    return 0;
                }
            }else {
                if(a > b + 32) {
                    return 1;
                }else if(a < b + 32) {
                    return -1;
                }else {
                    return 0;
                }
            }
        }else {
            if(b >= 'a' && b <= 'z') {
                if(a + 32 > b) {
                    return 1;
                }else if(a + 32 < b) {
                    return -1;
                }else {
                    return 0;
                }
            }else {
                if(a > b) {
                    return 1;
                }else if(a < b) {
                    return -1;
                }else {
                    return 0;
                }
            }
        }
    }

}
