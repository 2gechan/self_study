package algorithm_practice.wed.practice02;

import java.util.Scanner;

public class section3_06_02 {
    static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int lt = 0, cnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) cnt++;

            while (cnt > k) {
                if (arr[lt++] == 0) cnt--;
            }
            answer = Math.max(answer, i - lt + 1);
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
