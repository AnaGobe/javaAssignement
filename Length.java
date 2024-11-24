package org.example;

public class Length {
    public static void main(String[] args) {
        String word = "საავადმყოფოო";

        if (word.length() % 2 == 0) {
            System.out.println("სიგრძე არის ლუწი");
        } else {
            System.out.println("სიგრძე არის კენტი");
        }
    }
}
