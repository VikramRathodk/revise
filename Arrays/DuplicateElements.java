package Arrays;
/*
 * 
 * The program aims to find duplicate elements in an array 
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String args[]) {
        int[] originalArray = { 10, 54, 52, 41, 10, 12, 14, 52, 52, 66, 33, 45 };
        int n = originalArray.length;
        // int[] duplicateElement = new int[n];
        // System.out.println(Arrays.toString(findDuplicate(originalArray, duplicateElement)));

        findDuplication(originalArray,n); 
        

    }


    private static void findDuplication(int[] originalArray,int n) {
        Set<Integer> duplicatesNumberSet = new HashSet();
        System.out.println("Duplicate Numbers found at : ");
       for (int i = 0; i < originalArray.length; i++) {
        if(!duplicatesNumberSet.add(originalArray[i])){
            System.out.print(i+",");
        }
       }

    }


    //brute force logic
    private static int[] findDuplicate(int[] originalArray, int[] duplicateElement) {

        for (int i = 0; i < originalArray.length; i++) {
            for (int j = i + 1; j < originalArray.length; j++) {
                if (originalArray[i] == originalArray[j]) {
                    duplicateElement[i] = originalArray[i];

                }
            }

        }
        return duplicateElement;
    }
}
