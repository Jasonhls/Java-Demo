package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/6/14 15:40
 * @Description:
 */
public class Test95 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split("\\.");
        long l1 = Long.parseLong(split[0]);
        long l2 = Long.parseLong(split[1]);
        //壹、贰、叁、肆、伍、陆、柒、捌、玖、拾、佰、仟、万、亿、元、角、分、零、整
        long a = 100000000l;
        long b = 10000l;
        long c= 1000l;
        StringBuilder sb = new StringBuilder();
        sb.append("人民币");

        if(l1 > a) {
            long a1 = l1 / a;
            if(a1 / 1000 > 0) {
                sb.append(get(a1 / 1000)).append("仟");
                a1 = a1 - a1 / 1000 * 1000;
            }
            if(a1 / 100 > 0) {
                sb.append(get(a1 / 100)).append("佰");
                a1 = a1 - a1 / 100 * 100;
            }else {
                String sss = sb.toString();
                if(sss.contains("仟")) {
                    sb.append("零");
                }
            }
            if(a1 / 10 > 0) {
                if(a1 / 10 != 1) {
                    sb.append(get(a1 / 10));
                }
                sb.append("拾");
                a1 = a1 - a1 / 10 * 10;
            }
            if(a1 > 0) {
                sb.append(get(a1));
            }
            sb.append("亿");
            l1 = l1 - l1 / a * a;
        }

        if(l1 > b) {
            long b1 = l1 / b;
            if(b1 / 1000 > 0) {
                sb.append(get(b1 / 1000)).append("仟");
                b1 = b1 - b1 / 1000 * 1000;
            }
            if(b1 / 100 > 0) {
                sb.append(get(b1 / 100)).append("佰");
                b1 = b1 - b1 / 100 * 100;
            }else {
                String sss = sb.toString();
                if(sss.contains("仟")) {
                    sb.append("零");
                }
            }
            if(b1 / 10 > 0) {
                if(b1 / 10 != 1) {
                    sb.append(get(b1 / 10));
                }
                sb.append("拾");
                b1 = b1 - b1 / 10 * 10;
            }
            if(b1 > 0) {
                sb.append(get(b1));
            }
            sb.append("万");
            l1 = l1 - l1 / b * b;
        }

        if(l1 / 1000 > 0) {
            sb.append(get(l1 / 1000)).append("仟");
            l1 = l1 - l1 / 1000 * 1000;
        }
        if(l1 / 100 > 0) {
            sb.append(get(l1 / 100)).append("佰");
            l1 = l1 - l1 / 100 * 100;
        }else {
            String sss = sb.toString();
            if(sss.contains("仟")) {
                sb.append("零");
            }
        }
        if(l1 / 10 > 0) {
            if(l1 / 10 != 1) {
                sb.append(get(l1 / 10));
            }
            sb.append("拾");
            l1 = l1 - l1 / 10 * 10;
        }
        if(l1 > 0) {
            sb.append(get(l1));
        }
        String sss = sb.toString();
        if(!sss.endsWith("人民币")) {
            sb.append("元");
        }

        if(l2 == 0l) {
            sb.append("整");
        }else {
            if(l2 / 10 > 0) {
                sb.append(get(l2 / 10)).append("角");
                l2 = l2 - l2 / 10 * 10;
            }
            if(l2 > 0) {
                sb.append(get(l2)).append("分");
            }
        }
        System.out.println(sb);
    }


    public static String get(long a) {
        if(a == 1l) {
            return "壹";
        }else if(a == 2l) {
            return "贰";
        }else if(a == 3l) {
            return "叁";
        }else if(a == 4l) {
            return "肆";
        }else if(a == 5l) {
            return "伍";
        }else if(a == 6l) {
            return "陆";
        }else if(a == 7l) {
            return "柒";
        }else if(a == 8l) {
            return "捌";
        }else if(a == 9l) {
            return "玖";
        }
        return "";
    }
}
