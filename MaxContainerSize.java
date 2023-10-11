package com.samplepage.Relevel;

public class MaxContainerSize {
    static int getMaxArea(int[] arr){
        int maxArea = 0;
        int start =0;
        int last = arr.length-1;

        while (start<last){
            int currentArea = (Math.min(arr[start],arr[last])*(last-start));
            maxArea = Math.max(currentArea,maxArea);

            if (arr[start]<arr[last]){
                start++;
            }else {
                last--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args){
        int [] arr = {1,8,6,2,5,4,8,3,7};
        int area = getMaxArea(arr);
        System.out.println(area);
    }


    }



