package infren.section8;

import java.util.Scanner;

// 제한 시간 안에 최대 점수 얻기(dfs 알고리즘)
public class section8_03 {
    static int n, m, answer = 0;
    static void dfs(int x, int scoreSum, int timeSum, int[] score, int[] time) {
        if (timeSum > m) return;
        if (x == n) answer = Math.max(answer, scoreSum);
        else {
            dfs(x + 1, scoreSum + score[x], timeSum + time[x], score, time);
            dfs(x + 1, scoreSum, timeSum, score, time);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] score = new int[n];
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        dfs(0, 0, 0, score, time);
        System.out.println(answer);
    }
}
