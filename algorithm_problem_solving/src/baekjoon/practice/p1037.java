package baekjoon.practice;

import java.util.Arrays;
import java.util.Scanner;

public class p1037 {
    static int solution(int n, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        if (n == 1) answer = arr[0] * arr[0];
        else {
            int lt = 0, rt = n - 1;
            answer = arr[lt] * arr[rt];
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(solution(n, arr));
    }
}
