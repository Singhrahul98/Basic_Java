package com.samplepage.Relevel.Self_Practice;
import java.util.Scanner;

public class Pyramid_Using_forLoop {
    public static void main (String[] args){
        int n =4;
      // Half Pyramid Pattern
   //  for (int i=1; i<=4; i++){
   //      for (int j=1; j<=i; j++){
   //          System.out.print("*");
   //      }
   //      System.out.println();
   //  }

        // Half Inverted Pyramid Pattern
     //    for (int i=1; i<=4; i++){
     //        for (int j=4; j>=i; j--){
     //            System.out.print("*");
     //        }
     //        System.out.println();
     //    }


        // Pascal Star Pattern
      //   for (int i=1; i<=4; i++){
      //       for(int j=1; j<=i; j++){
      //           System.out.print("*");
      //       }
      //       System.out.println();
      //   }

      //   for (int i=1; i<=3; i++){
      //       for (int j=3; j>=i; j--){
     //            System.out.print("*");
     //        }
     //        System.out.println();
     //    }


        // Inverted Pyramid in rotated 180
      //    for (int i=1; i<=4; i++) {
      //        for (int j = 3; j >= i; j--) {
      //            System.out.print(" ");
      //        }
      //        for (int k = 1; k <= i; k++) {
      //
      //            System.out.print("*");
      //        }
      //        System.out.println();
      //    }

        // Inverted Pyramid in rotated 360
       for (int i=1; i<=5; i++){
           for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k=5; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }

        // Pyramid full using for loop
         for (int i=1; i<=4; i++){
             for (int j=4; j>=i; j--){
                 System.out.print(" ");
             }
             for (int k=1; k<=i; k++){
                 System.out.print("*");
             }
             for (int l=2; l<=i; l++){
                 System.out.print("*");
             }
             System.out.println();
         }



       }
}
