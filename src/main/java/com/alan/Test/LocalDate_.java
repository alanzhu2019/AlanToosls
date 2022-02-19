package com.alan.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        int year = now.getYear();
        System.out.println(year);

        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss E");
        String format = dateTimeFormatter.format(now);
        System.out.println(format);


        LocalDateTime localDateTime = now.plusDays(890);
        String format1 = dateTimeFormatter.format(localDateTime);
        System.out.println(format1);

        LocalDateTime localDateTime1 = now.minusMinutes(3456);
        System.out.println(localDateTime1);
    }
}
