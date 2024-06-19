package algorithm_practice01.wed;

import java.util.Scanner;

/*
최대점수 구하기(DFS)
이번 정보올림피아드대회에서 좋은 성적을 내기 위하여
현수는 선생님이 주신 N개의 문제를 풀려고 합니다.
각 문제는 그것을 풀었을 때 얻는 점수와 푸는데 걸리는 시간이 주어지게 됩니다.
제한시간 M안에 N개의 문제 중 최대점수를 얻을 수 있도록 해야 합니다.
(해당문제는 해당시간이 걸리면 푸는 걸로 간주한다, 한 유형당 한개만 풀 수 있습니다.)
 */

public class section8_03_01 {
    static int max = 0, n, m;
    static int[] chk, score, time;
    static void solution(int v, int s, int t) {
        if (t > m) return;
        if (v == n) {
            max = Math.max(max, s);
        }
        else {
            solution(v + 1, s + score[v], t + time[v]);
            solution(v + 1, s, t);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        chk = new int[n];
        score = new int[n];
        time = new int[n];
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            score[i] = s;
            time[i] = t;
        }
        solution(0, 0, 0);
        System.out.println(max);
    }
}
