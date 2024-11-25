package org.example;

public class Main {
    public static void main(String[] args) {

        //int[] numbers = {1, 3, 5, 7, 9, 11};
        int[] numbers = {2, 3, 3, 4, 9, 11};
        int evenAmount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenAmount++;
            }
        }

        if (evenAmount == 0) {
            System.out.println("მასივში არ არის ლუწი რიცხვი");
        } else {
            System.out.println("ლუწი რიცხვების რაოდენობა: " + evenAmount);
        }


        checkNumber(15);
        hasTeen(12, 15, 20);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("დადებითი");
        } else if (number < 0) {
            System.out.println("უარყოფითი");
        } else {
            System.out.println("ნული");
        }
    }



    public static void hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
