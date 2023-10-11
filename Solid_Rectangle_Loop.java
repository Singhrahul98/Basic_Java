package com.samplepage.Relevel.Self_Practice;
import java.util.Scanner;

public class Solid_Rectangle_Loop {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        //Solid Rectangler
      //  System.out.println("Enter a number");
      //  int n = sc.nextInt();
      //  for (int i=1; i<=n; i++){
      //  for (int j=1; j<=n+5; j++){
       //     System.out.print("*");
       // }
       // System.out.println();
       // }

        // Hollow Rectangle
      //  System.out.println("Enter a number");
      //  int n = sc.nextInt();
      //  System.out.println();
      //  for (int i=1; i<=n; i++){
      //      for (int j=1; j<=n; j++){
      //          if (i==1 || j==1 || i==n || j==n){
      //              System.out.print("*");
      //          }else{
      //             System.out.print(" ");
      //          }
      //      }
      //      System.out.println();
      //  }

        // Half pyramid Pattern
       System.out.println("Eneter a number");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Half Inverted Pyramid Pattern
      //  System.out.println("Enter a Number");
      //  int n = sc.nextInt();
      //  for (int i=n; i>=1; i--){
      //      for (int j=1; j<=i; j++){
      //          System.out.print("*");
      //      }
      //      System.out.println(" ");
     //   }

        // Half Inverted Pyramid Rotated 180 degree
     //   System.out.println("Enter a numer");
     //   int n = sc.nextInt();
     //    for (int i=1; i<=n; i++){
     //        for (int j=1; j<=n-i; j++){
     //            System.out.print(" ");
     //        }
     //
     //        for (int j=1; j<=i; j++){
     //            System.out.print("*");
     //        }
     //        System.out.println();
     //    }






    }
}
