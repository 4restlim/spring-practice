package com.practice.javaoop;

import com.practice.javaoop.Logic.BubbleSort;
import com.practice.javaoop.Logic.JavaSort;
import com.practice.javaoop.Logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
