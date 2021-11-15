package com.Lambda_assignment;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ThreadMain {
    public static void main(String[] args) {
        List<Thread> list = Arrays.asList(
                new Thread(45),
                new Thread(98));
       Consumer<Thread> consumer = thread -> System.out.println(thread);
        list.forEach(consumer);
    }
}