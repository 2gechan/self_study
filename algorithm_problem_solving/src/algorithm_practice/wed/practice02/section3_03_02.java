package algorithm_practice.wed.practice02;

import java.util.Scanner;

public class section3_03_02 {

    static int solution(int n, int k, int[] arr) {
        int answer = 0, current = 0;
        for (int i = 0; i < k; i++) {
            current += arr[i];
        }
        for (int i = k; i < n; i++) {
            current = current - arr[i - k] + arr[i];
            if (current > answer) answer = current;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }
}
