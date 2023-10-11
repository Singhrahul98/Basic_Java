package com.samplepage.Relevel;

public class GetMinMax {
    static int [] getMinMax (int [] arr, int maxlength){
        int [] minMaxValue = new int [2];
        minMaxValue[0] = Integer.MAX_VALUE; // Minimum value Stores
        minMaxValue[1] = Integer.MIN_VALUE; // Maximum VAlue Stores

        for (int i=0; i<maxlength; i++){
            if (arr[i] <minMaxValue[0]){
                minMaxValue[0] = arr[i];
            }
            else if (arr[i] >minMaxValue[1]){
                minMaxValue[1] = arr[i];
            }
        }
        return minMaxValue;
    }

    public static void main(String[] args){
        int[] arr = {1,9,1,8,2};
        int [] result = getMinMax(arr,5);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }


    }


