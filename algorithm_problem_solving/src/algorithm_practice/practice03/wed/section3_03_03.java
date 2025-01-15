package algorithm_practice.practice03.wed;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class section3_03_03 {

    static int solution(int K, int[] arr) {
        int answer = 0, sum = 0;

        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }
        answer = sum;
        int lt = 0;

        for (int i = K; i < arr.length; i++) {
            sum -= arr[lt];
            sum += arr[i];
            answer = Math.max(answer, sum);

            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(K, arr));
    }
}
