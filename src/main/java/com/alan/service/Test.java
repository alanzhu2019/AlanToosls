package com.alan.service;

public class Test {

    public static void main(String[] args) {
        StringBuffer alan = new StringBuffer("alan");

        StringBuffer stringBuffer = new StringBuffer(100);

        StringBuilder stringBuilder = new StringBuilder();


        alan.append(",666");
        System.out.println(alan);


        alan.delete(4,5);

        System.out.println(alan);

        alan.replace(4,4,",0213");

        System.out.println(alan);

        int i = alan.indexOf(",");
        System.out.println(i);


        alan.insert(4,"小蕙玲");

        System.out.println(alan);

        System.out.println(alan.length());

        System.out.println("=====================");

        String s = null;
        StringBuffer sb = new StringBuffer();
        sb.append(s);
        System.out.println(sb.length());

        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer(s);
        System.out.println(sb1);

    }
}
