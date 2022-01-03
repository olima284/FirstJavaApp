package com.careerdevs;

public class Main {

    public static void main(String[] args) {
	    //int test1 = getFirstElement(new int[] {1,2,3});
        //System.out.println(test1);
    }
    public static int getFirstElement(int[] arr){
        int firstNum = arr[0];
        return firstNum;
    }
    public static int addition(int num) {
        return ++num;

    }
    public static int search(int arr[], int item) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
}

