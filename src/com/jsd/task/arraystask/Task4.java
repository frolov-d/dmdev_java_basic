package com.jsd.task.arraystask;

/**
 * 4. Опеределить сумму элементов целочисленного массива, расположенных между минимальным и
 *  максимальным значением.
 */
public class Task4 {

    public static void main(String[] args) {
        int[] values = {1, 2, 10, 5, 6, 4, 0, 3};

//        System.out.println(findMaxIndex(values));
//        System.out.println(findMinIndex(values));
        System.out.println(calculateSumBetween(values));
    }

    public static int calculateSumBetween(int[] values) {
        var minIndex = findMinIndex(values);
        var maxIndex = findMaxIndex(values);
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }
        int result = 0;
        for (int i = minIndex + 1; i < maxIndex; i++) {
            result += values[i];
        }
        return result;
    }

    public static int findMinIndex(int[] values) {
        int minValue = values[0];
        int minIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (minValue > values[i]) {
                minValue = values[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static int findMaxIndex(int[] values) {
        int maxIndex = 0;
        int maxValue = values[maxIndex];
        for (int i = 0; i < values.length; i++) {
            if (maxValue < values[i]) {
                maxValue = values[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
