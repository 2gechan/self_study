package challenge.week3;

import java.util.Scanner;

public class w3_05 {

    static int[][] arr;
    static int solution(int n, int r) {
        if (arr[n][r] > 0) return arr[n][r]; // 이미 DP를 거쳐갔는지 확인

        if (n == r || r == 0) return arr[n][r] = 1; // n == r 이 같거나 r == 0 이므로 경우의 수가 1개인 경우

        return arr[n][r] = solution(n - 1, r - 1) + solution(n - 1, r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (T > 0) {
            arr = new int[30][30];

            int n = sc.nextInt();
            int m = sc.nextInt();
            sb.append(solution(m, n)).append("\n");

            T--;
        }
        System.out.println(sb);
    }
}
