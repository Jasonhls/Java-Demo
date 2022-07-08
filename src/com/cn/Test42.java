package com.cn;

/**
 * @Author: helisen
 * @Date 2022/6/1 9:47
 * @Description:
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Test42 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        long l = Long.parseLong(s);
        StringBuilder sb = new StringBuilder();
        long a = l / 1000000000;
        if(a > 0) {
            extracted(sb, a);
            String ss = sb.toString();
            if(ss != null && ss != " ") {
                sb.append("billion").append(" ");
            }
        }
        long b = (l - a * 1000000000) / 1000000;
        if(b > 0) {
            extracted(sb, b);
            String ss = sb.toString();
            if(ss != null && ss != " ") {
                sb.append("million").append(" ");
            }
        }
        long c = (l - a * 1000000000 - b * 1000000) / 1000;
        if(c > 0) {
            extracted(sb, c);
            String ss = sb.toString();
            if(ss != null && ss != " ") {
                sb.append("thousand").append(" ");
            }
        }
        long d = l - a * 1000000000 - b * 1000000 - c * 1000;
        if(d > 0) {
            extracted(sb, d);
        }
        System.out.println(sb);
    }

    private static void extracted(StringBuilder sb, long a) {
        long a1 = a / 100;
        long a2 = (a - a1 * 100) / 10;
        long a3 = a - a1 * 100 - a2 * 10;
        if(a1 > 0) {
            sb.append(get(a1)).append(" ").append("hundred").append(" ");
        }
        if(a2 > 0) {
            String s = sb.toString();
            if(s.endsWith("hundred ")) {
                sb.append("and").append(" ");
            }
            if(a2 == 1) {
                sb.append(get2(a - a1 * 100)).append(" ");
                a3 = 0;
            }else {
                sb.append(get3(a2)).append(" ");
            }
        }
        if(a3 > 0) {
            String s = sb.toString();
            if(s.endsWith("hundred ")) {
                sb.append("and").append(" ");
            }
            sb.append(get(a3)).append(" ");
        }

    }

    public static String get(long l) {
        if(l == 1) {
            return "one";
        }else if(l == 2) {
            return "two";
        }else if(l == 3) {
            return "three";
        }else if(l == 4) {
            return "four";
        }else if(l == 5) {
            return "five";
        }else if(l == 6) {
            return "six";
        }else if(l == 7) {
            return "seven";
        }else if(l == 8) {
            return "eight";
        }else if(l == 9) {
            return "nine";
        }
        return "";
    }

    public static String get2(long l) {
        if(l == 10) {
            return "ten";
        }else if(l == 11) {
            return "eleven";
        }else if(l == 12) {
            return "twelve";
        }else if(l == 13) {
            return "thirteen";
        }else if(l == 14) {
            return "fourteen";
        }else if(l == 15) {
            return "fifteen";
        }else if(l == 16) {
            return "sixteen";
        }else if(l == 17) {
            return "seventeen";
        }else if(l == 18) {
            return "eighteen";
        }else if(l == 19) {
            return "nineteen";
        }
        return "";
    }

    public static String get3(long l) {
        if(l == 2) {
            return "twenty";
        }else if(l == 3) {
            return "thirty";
        }else if(l == 4) {
            return "forty";
        }else if(l == 5) {
            return "fifty";
        }else if(l == 6) {
            return "sixty";
        }else if(l == 7) {
            return "seventy";
        }else if(l == 8) {
            return "eighty";
        }else if(l == 9) {
            return "ninety";
        }
        return "";
    }
}
