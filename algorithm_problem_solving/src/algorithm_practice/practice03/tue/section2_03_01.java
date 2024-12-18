package algorithm_practice.practice03.tue;

import java.util.Scanner;

public class section2_03_01 {
    static String solution(int[] arr) {
        StringBuilder sb = new StringBuilder();

        int prev = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > prev) sb.append(arr[i] + " ");
            prev = arr[i];
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }
}
