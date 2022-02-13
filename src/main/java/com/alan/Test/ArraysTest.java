package com.alan.Test;

import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {

        int[] ints = {2,96,22,66};
        System.out.println(Arrays.toString(ints));

        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
