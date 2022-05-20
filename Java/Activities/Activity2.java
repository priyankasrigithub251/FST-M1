package Activities;

import java.util.Arrays;

public class Activity2 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 77, 10, 54, -11, 10};
        int count;
        count = arr.length;
        System.out.println("Count of Initial Array " + count);
        System.out.println("Printing initial array" + Arrays.toString(arr));
        int searchNum = 10;
        int requiredSum = 30;
        System.out.println("Result: " + result(arr, searchNum, requiredSum));

    }

    public static boolean result(int[] arr, int searchNum, int requiredSum) {
        int tempSum = 0;
        for (int number : arr) {
            if (number == searchNum) {
                tempSum += searchNum;
            }
        }
        if (tempSum > requiredSum) {
            return false;
        }
        System.out.println("Sum of 10's is calculated now");
        return tempSum == requiredSum;
            }
}