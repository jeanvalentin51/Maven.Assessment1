package com.zipcodewilmington.assessment1.part5;
import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

public class Palindrome {

    public Integer countPalindromes(String input){
        int result = 0;
        String [] stringLetters = new String[input.length()];
        stringLetters = input.split("");

        result = input.length();
/*
        // get the doubles
        for (int i = 1; i < input.length() -1; i++) {
            if (i != input.length() - 1) {
                if (stringLetters[i].equals(stringLetters[i + 1]) || stringLetters[i].equals(stringLetters[i - 1])) result++;
            }
        }
*/

        // added after

        result = 0;
        for (int i = 0; i < input.length(); i++) {
            // start from next letter
            for (int x = i + 1; x < input.length()+1; x++) {
                // check 0 1; 0 1 2; ....
                // ... 1 2; 1 3;  ....
                if (isPalindromic(input.substring(i,x))) {
                    result++;
                }
            }
        }
        return result;
    }

    public static boolean isPalindromic(String str) {
        return str.equals(BasicStringUtils.reverse(str));
    }
}
