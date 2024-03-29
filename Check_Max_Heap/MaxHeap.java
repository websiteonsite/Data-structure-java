// Problem statement
// Given an array of integers, check whether it represents max-heap or not.
// Return true if the given array represents max-heap, else return false.

// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 1 <= N <= 10^5
// 1 <= Ai <= 10^5
// Time Limit: 1 sec
// Sample Input 1:
// 8
// 42 20 18 6 14 11 9 4
// Sample Output 1:
// true

public class MaxHeap {

    public static boolean checkMaxHeap(int arr[]) {
        /*
         * Your class should be named Solution Don't write main(). Don't read input, it
         * is passed as function argument. Return output and don't print it. Taking
         * input and printing output is handled automatically.
         */
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if ((2 * i + 1) < n && arr[i] < arr[2 * i + 1])
                return false;
            if ((2 * i + 2) < n && arr[i] < arr[2 * i + 1])
                return false;
        }
        return true;
    }
}