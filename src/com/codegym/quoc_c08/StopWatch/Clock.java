package com.codegym.quoc_c08.StopWatch;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]array=new int[100000];
        for(int i=0; i < array.length;i++){
            array[i]=array.length-i;
        }
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        stopWatch.stop();
        System.out.println("Elapsed time :"+stopWatch.getElapsedTime()+"milliseconds");
    }
}
