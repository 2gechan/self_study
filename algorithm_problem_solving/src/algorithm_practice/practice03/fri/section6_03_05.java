package algorithm_practice.practice03.fri;

import java.util.Arrays;
import java.util.Scanner;

public class section6_03_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int prev = 0;
        String answer = "U";
        for (int i = 0; i < n; i++) {
            if (arr[i] == prev) {
                answer = "D";
                break;
            }
            prev = arr[i];
        }
        System.out.println(answer);
    }
}
