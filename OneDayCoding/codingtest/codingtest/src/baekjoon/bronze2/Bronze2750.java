package baekjoon.bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class Bronze2750 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
