package com.samplepage.Relevel;
import java.util.Scanner;

public class Compund_Interest {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);

        System.out.println("Enter Principal");
        double principal = object.nextDouble();
        System.out.println("Enter rate ");
        double rate = object.nextDouble();
        System.out.println("Enter time");
        int time = object.nextInt();

        double amount = principal;
        for (int i=1; i<=time; i++){
            double interest = (amount * rate *1 )/100;
            amount += interest;
            System.out.println(" amount after " + i+" year "+amount);
        }


    }
}
