package Check_Max_Heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Runner {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws NumberFormatException, IOException {

        int n = s.nextInt();
        int input[] = new int[n];
        for (int j = 0; j < n; j++) {
            input[j] = s.nextInt();
        }

        System.out.println(MaxHeap.checkMaxHeap(input));
    }
}