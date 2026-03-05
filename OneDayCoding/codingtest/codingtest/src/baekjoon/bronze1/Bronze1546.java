package baekjoon.bronze1;

import java.util.Arrays;
import java.util.Scanner;

public class Bronze1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double max = Arrays.stream(arr).max().getAsInt();

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i] / max * 100;
        }

        System.out.println(sum / n);
    }
}
