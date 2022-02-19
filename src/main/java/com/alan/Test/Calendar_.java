package com.alan.Test;

import java.util.Calendar;

public class Calendar_ {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println(c);

        System.out.println("年：" + c.getWeekYear());

        System.out.println(c.get(Calendar.YEAR));

    }
}
