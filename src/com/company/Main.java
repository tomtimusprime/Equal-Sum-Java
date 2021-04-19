package com.company;

public class Main {

    public static void main(String[] args) {
	equalSumChecker(1,1,2);
	equalSumChecker(1,3,6);
	equalSumChecker(3,3,6);
    }

    public static boolean equalSumChecker(int num1, int num2, int sum1and2) {
        int total = num1 + num2;
        if(total == sum1and2) {
            System.out.println("Num1 and Num2 equal the third parameter.");
            return true;
        } else {
            System.out.println("Num1 and Num2 do not equal the third parameter.");
        }
        return false;
    }
}
