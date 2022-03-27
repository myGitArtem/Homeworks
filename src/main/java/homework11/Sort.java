package homework11;

import java.util.Arrays;
import java.util.Random;

public class Sort {

        public static final int COUNT = 100;

        public static void main(String[] args) {
            int[] arr = createRandomArray(COUNT);
            mergeSort(arr);
            System.out.println(Arrays.toString(arr));
        }
        public static int[] createRandomArray(int count) {
            Random random = new Random();
            int[] arr = new int[count];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100);
            }
            return arr;
        }
        public static void mergeSort(int[] arr) {
            if (arr.length <= 1) {
                return;
            }
            int[] left = new int[arr.length / 2];
            int[] right = new int[arr.length - left.length];

            System.arraycopy(arr, 0, left, 0, left.length);
            System.arraycopy(arr, left.length, right, 0, right.length);

            mergeSort(left);
            mergeSort(right);
            merge(arr, left, right);
        }

        private static void merge(int[] arr, int[] left, int[] right) {
            int leftIndex = 0;
            int rightIndex = 0;
            int i = 0;

            while (leftIndex < left.length && rightIndex < right.length) {
                arr[i++] = left[leftIndex] < right[rightIndex] ? left[leftIndex++] : right[rightIndex++];
            }
            while (leftIndex < left.length) {
                arr[i++] = left[leftIndex++];
            }
            while (rightIndex < right.length) {
                arr[i++] = right[rightIndex++];
            }
        }
    }
