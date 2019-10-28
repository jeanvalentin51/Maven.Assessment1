package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int result = 0;

        for (int i = 0; i < objectArray.length; i++){
            if (objectArray[i].equals(objectToCount)) result++;
        }

        return result;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Integer [] result;
        int counter = 0;

        counter = getNumberOfOccurrences(objectArray,objectToRemove);
        result = new Integer[objectArray.length - counter];
        counter = 0;

        for (int i = 0; i < objectArray.length; i++){
            if (objectArray[i].equals(objectToRemove)){

            }else {
                result[counter] = (Integer) objectArray[i];
                counter ++;
            }
        }

        return result;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Integer result = 0;
        int counterEachElement = 1;
        int counterMax = 0;

        Arrays.sort(objectArray);

        for (int i = 1; i < objectArray.length; i++){

            if (objectArray[i].equals(objectArray[i-1])){
                counterEachElement ++;
            } else {
                counterEachElement = 1;
            }

            if (counterEachElement > counterMax) {
                counterMax = counterEachElement;
                result = (Integer) objectArray[i];
                if (objectArray[i].equals(objectArray[i+1]) && i != (objectArray.length -1)) counterEachElement = 1;
            }
        }

        return result;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        return null;
    }
}
