package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        int result = 0;
        String [] stringLetters = new String[input.length()];
        stringLetters = input.split("");

        result = input.length();

        // get the doubles
        for (int i = 1; i < input.length() -1; i++) {
            if (i != input.length() - 1) {
                if (stringLetters[i].equals(stringLetters[i + 1]) || stringLetters[i].equals(stringLetters[i - 1])) result++;
            }
        }

        return result;
    }
}
