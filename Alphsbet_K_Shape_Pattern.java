package com.samplepage.Relevel;
//import java.util.Scanner;

public class Alphsbet_K_Shape_Pattern {
    public static void main (String[] args){
        int alphabet = 65;
        for (int i=5; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print((char)(alphabet+j) + " ");
            }
            System.out.println();
        }

       for (int i=0; i<=5; i++){
           for (int j=0; j<=i; j++){
               System.out.print((char) (alphabet+j) + " ");
           }
           System.out.println();
       }
    }
}
