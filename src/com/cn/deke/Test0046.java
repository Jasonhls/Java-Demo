package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test0046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        // \w:表示一个字 [0-9a-zA-Z_]
        // \W:表示除[0-9a-zA-Z_]之外的字符
//        String[] split = s.split("\\w+");
        List<String> operators = Arrays.asList(s.split("\\w+")).stream()
                .filter(x -> !x.isEmpty())
                .collect(Collectors.toList());
        List<Integer> numbers = Arrays.asList(s.split("\\W+")).stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int index = operators.indexOf("$");
        while(index != -1) {
            int tmp = b(numbers.get(index), numbers.get(index + 1));
            //原来index位置上的元素为numbers.get(index)，现在替换为计算之后的结果
            numbers.set(index, tmp);
            //同时把index+1位置上的元素移除掉，因为已经参与过计算
            numbers.remove(index + 1);
            //操作集合中index的运算符已经参加了运算，就移除掉
            operators.remove(index);
            //继续寻找下一个$运算符的位置
            index = operators.indexOf("$");
        }
        int total = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            total = a(total, numbers.get(i));
        }
        System.out.println(total);
    }

    public static int a(int x, int y) {
        return 2 * x + 3 * y + 4;
    }

    public static int b(int x, int y) {
        return 3 * x + y + 2;
    }
}
