package algorithm_practice.practice03.wed;

import java.util.Scanner;

public class section8_03_03 {

    static int n, m, answer = 0;
    static int[][] arr;

    static void solution(int l, int limit, int score) {
        if (limit > m) return;
        if (l == n) {
            answer = Math.max(answer, score);
        } else {
                solution(l + 1, limit + arr[l][1], score + arr[l][0]);
                solution(l + 1, limit, score);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n][2];
        for (int i = 0; i < n; i++) {

            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        solution(0, 0, 0);
        System.out.println(answer);
    }
}
