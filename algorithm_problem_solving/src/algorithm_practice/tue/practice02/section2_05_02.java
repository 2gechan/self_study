package algorithm_practice.tue.practice02;

import java.util.Arrays;
import java.util.Scanner;

public class section2_05_02 {

    static int solution(int n) {
        int answer = 0;

        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) arr[j] = 1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
