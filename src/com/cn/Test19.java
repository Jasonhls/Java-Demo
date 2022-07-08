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
public class Test19 {
    //1 0 1 0 0 2 1
    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int errorNum = 0;//错误IP地址或错误掩码
        int privateIpNum = 0;//私有IP的个数
        List<String> list = new ArrayList<>();
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

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            String[] arr = s.split("~");
            //IP地址
            String ipAddressStr = arr[0];
            //掩码
            String maskCode = arr[1];

            //当前这行数据中ip地址或掩码是否非法
            boolean dataTrue = true;
            //如果长度正常
            Integer ipOne = null;
            Integer ipTwo = null;

            StringBuilder s1 = new StringBuilder();

            //处理IP地址
            //长度不等于4的
            String[] split = ipAddressStr.split("\\.");
            if(split.length != 4) {
                errorNum++;
                dataTrue = false;
            }else {
                for (int j = 0; j < 4; j++) {
                    try {
                        Integer integer = Integer.valueOf(split[j]);
                        //超出0到255范围的
                        if(integer > 255 || i < 0) {
                            errorNum++;
                            dataTrue = false;
                            break;
                        }
                        if(j == 0) {
                            ipOne = integer;
                        }
                        if(j == 1) {
                            ipTwo = integer;
                        }

                    } catch (NumberFormatException numberFormatException) {
                        //不是数字的
                        errorNum++;
                        dataTrue = false;
                        break;
                    }
                }

            }

            //如果IP地址错误，就不用再去判断掩码是否错误了
            if(!dataTrue) {
                continue;
            }


            //处理掩码
            String[] split1 = maskCode.split("\\.");
            if(split1.length != 4) {
                errorNum++;
                dataTrue = false;
            }else {
                for (int k = 0; k < 4; k++) {
                    try {
                        Integer integer = Integer.parseInt(split1[k]);
                        if(integer > 255 || integer < 0) {
                            errorNum++;
                            dataTrue = false;
                            break;
                        }
                        String s2 = Integer.toBinaryString(integer);
                        String ss = "00000000" + s2;
                        s1.append(ss.substring(ss.length() - 8));
                    }catch (Exception e1) {
                        errorNum++;
                        dataTrue = false;
                        break;
                    }
                }
            }

            if(dataTrue && (ipOne == 0 || ipOne == 127)) {
                //什么也不是，不处理
                continue;
            }


            if(dataTrue) {
                String s3 = "01";
                String s2 = s1.toString();
                //注意全是0或全是1也都是非法掩码
                if(s2.contains(s3) || !s2.contains("1") || !s2.contains("0")) {
                    System.out.println(maskCode);
                    System.out.println(s2);
                    errorNum++;
                    dataTrue = false;
                    continue;
                }
            }

            if(dataTrue && ipOne != null) {
                if(ipOne >= 1 && ipOne <= 126) {
                    a++;
                }else if(ipOne >= 128 && ipOne <= 191) {
                    b++;
                }else if(ipOne >= 192 && ipOne <= 223) {
                    c++;
                }else if(ipOne >= 224 && ipOne <= 239) {
                    d++;
                }else if(ipOne >= 240) {
                    e++;
                }
                //从10.0.0.0到10.255.255.255 私网IP
                if(ipOne == 10) {
                    privateIpNum++;
                }
                //从172.16.0.0到172.31.255.255  私网IP
                if(ipOne == 172 && (ipTwo >= 16 && ipTwo <= 31)) {
                    privateIpNum++;
                }
                //从192.168.0.0到192.168.255.255 私网IP
                if(ipOne == 192 && ipTwo == 168) {
                    privateIpNum++;
                }
            }

        }
        String s5 = " ";
        sb.append(a).append(s5).append(b).append(s5).append(c).append(s5)
                .append(d).append(s5).append(e).append(s5)
                .append(errorNum).append(s5).append(privateIpNum);
        System.out.print(sb);
    }

}
