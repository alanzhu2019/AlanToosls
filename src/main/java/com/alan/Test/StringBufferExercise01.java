package com.alan.Test;

import java.util.Scanner;

public class StringBufferExercise01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*获取输入的价格*/
        System.out.print("请输入商品价格：");
        String s = scanner.next();
        StringBuffer sb = new StringBuffer(s);

        //找到小数点的索引，在找到前三位加，号。
        int i = sb.lastIndexOf(".");

        int temp = i / 3;
        if (temp > 0){
            for (int j = 0; j < temp; j++) {
                if (i - 3 > 0){
                    sb.insert(i - 3,",");
                    i = i-3;
                }
            }
        }
        System.out.println(sb);


    }

}
