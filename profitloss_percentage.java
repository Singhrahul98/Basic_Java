package com.samplepage.Relevel.Self_Practice;
import java.util.Scanner;

public class profitloss_percentage {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cp: ");
        double cp = sc.nextInt();
        System.out.println("Enter sp: ");
        double sp = sc.nextInt();
        double difference = sp - cp;
        difference = Math.abs(sp-cp);
        double percentage = difference/cp*100;
        if(cp>sp){
            System.out.println("Loss = " + difference);
            System.out.println("Loss Percentage = " + percentage + '%');
        }else if (cp<sp){
            System.out.println("Profit = " + difference);
            System.out.println("Profit Percentage = " + percentage +'%' );
        }else {
            System.out.println("No Profit No Loss");
        }

    }
}