package graphs.Part_1.Getpath;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static ArrayList<Integer> getPath(int[][] edges, int sv, int ev, boolean[] visited) {
        if (sv == ev) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            visited[sv] = true;
            list.add(sv);
            return list;
        }
        visited[sv] = true;
        for (int i = 0; i < edges.length; i++) {
            if (edges[sv][i] == 1 && !visited[i]) {
                ArrayList<Integer> arr = getPath(edges, i, ev, visited);
                if (arr != null) {
                    arr.add(sv);
                    return arr;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        int n;
        int e;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        e = sc.nextInt();
        int edges[][] = new int[n][n];
        for (int i = 0; i < e; i++) {
            int fv = sc.nextInt();
            int sv = sc.nextInt();
            edges[fv][sv] = 1;
            edges[sv][fv] = 1;
        }
        int sv = sc.nextInt();
        int ev = sc.nextInt();
        boolean[] visited = new boolean[n];
        ArrayList<Integer> ans = getPath(edges, sv, ev, visited);

        if (ans != null) {
            for (int elem : ans) {
                System.out.print(elem + " ");
            }
        }
    }

}