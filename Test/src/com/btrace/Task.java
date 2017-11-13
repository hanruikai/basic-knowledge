package com.btrace;

public class Task {

    public int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Task task = new Task();
        while (true) {
            task.sum(1, 2);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {

            }
        }
    }
}
