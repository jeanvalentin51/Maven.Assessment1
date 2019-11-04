package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        int minSteps = 0;

        // jump the same as the distance
        if (k == j) minSteps = 1;

        if (k%j == 0 ) minSteps = k/j;

        if (k%j !=0) minSteps = k/j + k%j;
        return minSteps;
    }
}
