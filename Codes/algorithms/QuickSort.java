package algorithms;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {45, 0, 7, 98, 36, 1, 5};

        quickSort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    static void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {

            while (nums[s] < pivot) {
                s++;
            }

            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(nums, low, e);
        quickSort(nums, s, high);
    }
}
