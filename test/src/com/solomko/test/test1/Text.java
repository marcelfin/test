package com.solomko.test.test1;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

    public static void secondTest() throws IOException {

        System.out.println("Choose M");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();

        if (m >= 1 && m <= 100) {

            System.out.println("Input A");
            Scanner scan2 = new Scanner(System.in);
            String a = scan2.nextLine(); // Read the first name
            while (!a.matches("[a-z]+")) { // Check if it has anything other than alphabets
                a = scan2.nextLine(); // if not, ask the user to enter new first name
            }

            System.out.println("Enter your strings");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] strings = new String[m];

            for (int i = 0; i < strings.length; i++) {
                strings[i] = reader.readLine();
            }
            System.out.println("Your string is " + strings[1]);


            for (int i = 0; i < strings.length; i++) {

                String in = strings[i];
                int occurrences = 0;
                Pattern p = Pattern.compile(a);
                Matcher mat = p.matcher(in);
                while (mat.find()) {
                    occurrences++;

                }
//                int[] arr = new int[i];
//                occurrences = arr[i];
                System.out.println("Number of occurrences in " + strings[i] + "is " + occurrences);

            }


//            for(int i = 0; i < 3; i++){
//                arr[i] = in.nextLine();
//            }
////bubble
//            for(int i = arr.length-1 ; i > 0 ; i--){
//                for(int j = 0 ; j < i ; j++){

            //compare
//                    if( arr[j].length() > arr[j+1].length() ){
//                        String tmp = arr[j];
//                        arr[j] = arr[j+1];
//                        arr[j+1] = tmp;
//                    }
//                }
//            }

//            for(int i = 0; i < arr.length; i++){
//                System.out.println(arr[i]);
//            }

        }

    }

}
