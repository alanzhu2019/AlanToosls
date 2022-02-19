package com.alan.Test;

import java.util.Scanner;



public class HomeWork01 {

    public static void main(String[] args) {
        int start = 0;
        int end = 0;

        System.out.println("字符串反转：除首位部分其余颠倒（例：“abcdef” 反转后“aedcbf”）");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要转换的字符串：");
        String str = scanner.next();

        System.out.print("请输入从第几个字符开始反转：");
        Scanner scanner1 = new Scanner(System.in);
         start = scanner1.nextInt();

        boolean flag = true;
        while (flag){
            int length = str.length();
            System.out.print("请输入从第几个字符结束反转,当前字符长度为 " + length + ":" );
            Scanner scanner2 = new Scanner(System.in);
            end = scanner2.nextInt();
            if (end <= length){
                flag = false;
            }else {
                System.out.println("长度超过当前字符串，请重新输入！");
            }

        }


        String ress = reverse(str, start, end);
        System.out.println("转换后为：" + ress);

    }


    public static String reverse(String s ,int start ,int end){

//        char[] chars = s.toCharArray();
//
//        String s1 = String.valueOf(chars,start-1, end);

        StringBuffer ss = new StringBuffer(s);

        String s1 = ss.substring(start -1 , end);

        StringBuffer stringBuffer = new StringBuffer(s1);
        String reverse = stringBuffer.reverse().toString();

        StringBuffer replace = ss.replace(start -1, end, reverse);

        return replace.toString();

    };
}
