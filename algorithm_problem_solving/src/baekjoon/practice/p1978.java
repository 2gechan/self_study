package baekjoon.practice;

import java.util.Scanner;

public class p1978 {
    static int solution(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int cnt = 0;
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    cnt++;
                    break;
                }
            }
            if (num != 1 && cnt == 0) answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(solution(arr));
    }
}
