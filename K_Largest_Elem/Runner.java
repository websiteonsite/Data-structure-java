package K_Largest_Elem;

import java.io.IOException;
import java.util.Scanner;

public class Runner {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws NumberFormatException, IOException {

        int n = s.nextInt();
        int input[] = new int[n];
        for (int j = 0; j < n; j++) {
            input[j] = s.nextInt();
        }
        int k = s.nextInt();

        System.out.println(KLargest.kthLargest(n, input, k));
    }
}