package com.company.dspractice;

public class Main {

    public static void main(String[] args) {

        StopWatch sw = new StopWatch();

        sw.start();
        System.out.println("something");
        sw.stop();
        System.out.println("Elapsed time: " + sw.getElapsedTime());
    }
}
