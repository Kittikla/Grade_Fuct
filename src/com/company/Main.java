package com.company;

import java.util.Scanner;

public class Main {
    static int compareInteger(int i) {
        if (i >= 80) {
            return 4;
        } else if (i >= 75) {
            return (int) 3.5;

        } else if (i >= 70) {
            return 3;

        } else if (i >= 65) {
            return (int) 2.5;
        } else if (i >= 60) {
            return 2;
        } else if (i >= 55) {
            return (int) 1.5;
        } else if (i >= 50) {
            return 1;
        }else{
            return 0;
        }
    }

        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            System.out.println(compareInteger(in.nextInt()));
        }
}
