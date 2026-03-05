package practice.tue;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int before = Integer.MIN_VALUE;
        StringBuilder sb = new StringBuilder();
        for (int x : arr) {
            if (x > before) {
                sb.append(x + " ");
            }
            before = x;
        }
        System.out.println(sb.toString());
    }
}
