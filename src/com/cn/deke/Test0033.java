package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test0033 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split(",");
        Map<Integer, Integer> map = new HashMap<>(split.length);
        for (String str : split) {
            String[] split1 = str.split(":");
            map.put(Integer.parseInt(split1[0]), Integer.parseInt(split1[1]));
        }
        String[] split1 = br.readLine().split(",");
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < split1.length; j++) {
            boolean bb = false;
            for (Integer i :map.keySet()) {
                if(i >= Integer.parseInt(split1[j])) {
                    //如果当前这个用完了，继续下一个
                    if(map.get(i) == 0) {
                        continue;
                    }else {
                        //找到了直接返回
                        int newValue = map.get(i) - 1;
                        map.put(i, newValue);
                        bb = true;
                        sb.append(true);
                        if(j < split1.length - 1) {
                            sb.append(",");
                        }
                        break;
                    }
                }
            }
            //没有找到，设置为false
            if(!bb) {
                sb.append(false);
                if(j < split1.length - 1) {
                    sb.append(",");
                }
            }
        }
        System.out.println(sb);
    }
}
