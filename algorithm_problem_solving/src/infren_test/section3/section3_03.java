package infren_test.section3;

import java.util.Scanner;

public class section3_03 {
    static int solution(int n, int k, int[] arr) {
        int answer = 0, sum = 0;
        for (int i = 0; i < k; i++) sum += arr[i];
        answer = sum;
        for (int i = k; i < n; i++) { // sliding window 방식을 사용하면 시간복잡도 절약 가능
            sum += arr[i] - arr[i - k];
            answer = Math.max(answer, sum);
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
