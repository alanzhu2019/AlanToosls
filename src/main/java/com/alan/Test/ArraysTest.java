package com.alan.Test;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest {

    public static void main(String[] args) {

        int[] ints = {2,96,22,66};
        System.out.println(Arrays.toString(ints));

        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));


        Book[] books = new Book[5];
        books[0] = new Book("格林童话",25.6);
        books[1] = new Book("安徒生童话",55.0);
        books[2] = new Book("Java指南",11.9);
        books[3] = new Book("Linux",99.9);
        books[4] = new Book("Windows",60.0);


        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                double dValue =  o1.getPrice() - o2.getPrice();
                if (dValue > 0 ){
                    return 1;
                }else if (dValue < 0){
                    return -1;
                }else {
                    return 0;
                }
            }
        });


        System.out.println(Arrays.toString(books));


        int[] ints1 = {10,6,666};
        System.out.println(Arrays.toString(ints1));

        System.out.println("==============");

        int[] tt =  Arrays.copyOf(ints1,ints1.length);

        Arrays.sort(tt);
        System.out.println(Arrays.toString(tt));


    }
}


class Book {

    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
