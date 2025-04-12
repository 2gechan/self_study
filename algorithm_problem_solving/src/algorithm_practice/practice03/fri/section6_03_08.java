package algorithm_practice.practice03.fri;

import java.util.Arrays;
import java.util.Scanner;

public class section6_03_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int lt = 0, rt = arr.length - 1;
        int answer = 0;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            // 12 23 32 57 65 81 87 99
            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            if (arr[mid] < m) lt = mid + 1;
            else {
                rt = mid - 1;
            }
        }
        System.out.println(answer);
    }
}
