package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int result = 0;

        for (int i = 0; i <= n; i++){
            result += i;
        }

        return result;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int result = 1;

        for (int i = 1; i <= n; i++){
            result *=i;
        }
        return result;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        int result=0;
        String stringToReverse = "";
        String characterHolder = "";

        stringToReverse = String.valueOf(val);

        for (int i = stringToReverse.length(); i >0 ; i--){
            characterHolder += stringToReverse.valueOf(i);
        }

        return Integer.valueOf(characterHolder);
    }
}
