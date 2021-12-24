package com.careerdevs;

public class Main {

    public static void main(String[] args) {
	    int test1 = getFirstElement(new int[] {1,2,3});
        System.out.println(test1);
    }
    public static int getFirstElement(int[] arr){
        int firstNum = arr[0];
        return firstNum;
    }

}
