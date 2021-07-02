package com.solomko.test.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;

public class Numbers {
    public static void firstTest() {

        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();

        int k[] = new int[l];
//        for(int i=0; i<l;i++){ //перебор всех элементов
        for (int i = 0; i < k.length; i++) {
            k[i] = scan.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < k.length - 1; i++) {
            for (int j = i + 1; j < k.length; j++) {
                int x = k[i];
                int y = k[j];
                if ((x - y) < min) {
                    min = x - y;
                }
            }
        }
        System.out.println(Math.abs(min));
    }

}




