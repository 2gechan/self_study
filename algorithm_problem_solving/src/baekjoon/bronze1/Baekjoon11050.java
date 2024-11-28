package baekjoon.bronze1;

import java.util.Scanner;

public class Baekjoon11050 {

    static int[][] arr;
    static int solution(int n, int k) {
        if (n == k || k == 0) return 1;
        else {
            return arr[n][k] = solution(n - 1, k) + solution(n - 1, k - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        arr = new int[N + 1][K + 1];
        System.out.println(solution(N, K));
    }
}
