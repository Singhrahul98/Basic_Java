package com.samplepage.Relevel;
import java.util.Scanner;

public class Temprature_Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Type1 convert from fahrenheit to celsius: ");
        System.out.println("Type2 convert from celsius to fahrenheit: ");
        int choice = sc.nextInt();
        double ct = 0, ft = 0;

        switch (choice){
            case 1:
              System.out.println("enter temprature is fahrenheit ");
              ft = sc.nextDouble();
              ct = 5/9.0*(ft-32);
              System.out.println("this is celsius: " + ct);
            break;
            case 2:
              System.out.println("enter temprature is celsius ");
              ct = sc.nextDouble();
              ft = 1.8*ct+32;
              System.out.println("this temprature is fahrenheit" + ft);
            break;
            default:System.out.println("incorrect choice");

        }
    }
}

