package Arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class ArryasEasy {

    // get the max element from the given array
    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    /*
     * 
     * There are n kids with candies. You are given an integer array candies, where
     * each candies[i] represents the number of candies the ith kid has, and an
     * integer extraCandies, denoting the number of extra candies that you have.
     * 
     * Return a boolean array result of length n, where result[i] is true if, after
     * giving the ith kid all the extraCandies, they will have the greatest number
     * of candies among all the kids, or false otherwise.
     * 
     * Note that multiple kids can have the greatest number of candies.
     * 
     * 
     */
    public static ArrayList<Boolean> candiDistrubution(int[] candies, int extraCandies) {

        int max = getMax(candies);
        ArrayList<Boolean> ansList = new ArrayList<>();

        for (int i : candies) {
            if (i + extraCandies >= max)
                ansList.add(true);
            else
                ansList.add(false);

        }

        return ansList;

    }

    /*
     * Given an array nums. We define a running sum of an array as runningSum[i] =
     * sum(nums[0]…nums[i]).
     * 
     * Return the running sum of nums.
     * 
     * 
     */
    public static int[] runningSum(int arr[]) {

        int[] sum = new int[arr.length];
        sum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }

        return sum;

    }

    public static void main(String[] args) {
        // candiDistrubution
        int candies[] = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        System.out.println(candiDistrubution(candies, extraCandies));

        // Running Sum
        int arr[] = { 2, 5, 4, 25, 1, 2, 3, 54, 24 };
        System.out.println(Arrays.toString(runningSum(arr)));

    }

}