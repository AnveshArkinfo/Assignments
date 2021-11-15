package com.Lambda_assignment;

public class Thread {
private Integer number;
    Thread(int number)
    {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Thread{" +
                "number='" + number + '\'' +
                '}';
    }
}