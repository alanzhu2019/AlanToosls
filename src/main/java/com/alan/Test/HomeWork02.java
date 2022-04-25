package com.alan.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class HomeWork02 {

    public static void main(String[] args) {

        News news1 = new News("新冠确诊超千万");
        News news2 = new News("哔哩哔哩动画大会员,一年只要9.9元，赶快抢购！！！！！");

        ArrayList<News> news = new ArrayList<>();
        news.add(news1);
        news.add(news2);

        System.out.println(news);

        System.out.println("====倒叙遍历======");

        Collections.reverse(news);
        System.out.println(news);

        System.out.println("====处理标题，超过15个后面加...");

        Iterator<News> iterator = news.iterator();
        while (iterator.hasNext()){
            News next = iterator.next();
            String name = next.getName();
            if (name.length() > 15){
                next.setName(name.substring(0,15) + "...");
            }
        }

        System.out.println(news);

    }
}
