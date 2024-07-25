package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int firstTime = 0;
        int secondTime = 1;

        for (int i = 0; i < 10; i++) {
            System.out.print(firstTime+" ");

            int nextTime = firstTime + secondTime;
            firstTime = secondTime;
            secondTime = nextTime;
        }




        }

    }
