package com.Lambda_assignment;

import java.util.LinkedList;
import java.util.List;

public class OddLength {
    public static void main(String[] args) {
        List<String> list = new LinkedList();
        list.add("hiys");
        list.add("Zamuna");
        list.add("Sumuna");
        list.add("haseena");
        list.add("tyuidsk");
        list.removeIf(s -> s.length()%2 != 0);
        System.out.println(list);
    }
}