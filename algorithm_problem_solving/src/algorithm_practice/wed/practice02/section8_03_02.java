package algorithm_practice.wed.practice02;

import java.util.Scanner;

public class section8_03_02 {
    static int n, m, answer = 0;
    static int[][] arr;

    static void solution(int v, int sum, int time) {
        if (time > m) return;
        if (v == n) {
            answer = Math.max(answer, sum);
        }
        else {
            solution(v + 1, sum + arr[v][0], time + arr[v][1]);
            solution(v + 1, sum, time);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); // 점수
            arr[i][1] = sc.nextInt(); // 소요 시간
        }
        solution(0, 0, 0);
        System.out.println(answer);
    }
}
