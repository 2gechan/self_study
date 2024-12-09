package algorithm_practice.mon.practice02;

import java.util.Arrays;
import java.util.Scanner;

public class section6_10_02 {

    static int solution(int C, int[] arr) {
        int answer = Integer.MIN_VALUE;

        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int min = arr[0];

        while (min <= max) {
            int mid = (min + max) / 2;

            if (count(mid, arr) >= C) {
                answer = Math.max(answer, mid);
                min = mid + 1;
            } else max = mid - 1;

        }
        return answer;
    }

    static int count(int distance, int[] arr) {
        int cnt = 1;
        int before = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - before >= distance) {
                before = arr[i];
                cnt++;
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int position = sc.nextInt();
            arr[i] = position;
        }
        System.out.println(solution(C, arr));
    }
}
