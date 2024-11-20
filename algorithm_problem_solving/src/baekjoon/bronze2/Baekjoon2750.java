package baekjoon.bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int x : arr) System.out.println(x);
    }
}
