package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello");

        int a = 5;
        int rez = 1;
        for(int i=1; i<=a; i++){
            rez *=i;
        }
        System.out.println("first factorial "+ rez);



        int b = 5;
        int c = 1;
        int d = 1;
        while(d <= b){
            c*=d;
            d++;
        }
        System.out.println(c);
    }


}
