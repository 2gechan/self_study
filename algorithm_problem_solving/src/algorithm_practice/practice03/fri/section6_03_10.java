package algorithm_practice.practice03.fri;

import java.util.Arrays;
import java.util.Scanner;

public class section6_03_10 {

    static int solution(int[] arr, int c, int n) {
        Arrays.sort(arr);
        int answer = 0;
        int lt = arr[0];
        int rt = arr[n - 1];

        while (lt <= rt) {

            int mid = (lt + rt) / 2;
            if (check(arr, mid) >= c) {
                answer = mid;

                lt = mid + 1;
            } else rt = mid - 1;

        }

        return answer;
    }

    static int check(int[] arr, int mid) {

        int cnt = 1;
        int before = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - before >= mid) {
                cnt++;
                before = arr[i];
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    }
}
