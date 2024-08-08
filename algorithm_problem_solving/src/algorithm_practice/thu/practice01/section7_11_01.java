package algorithm_practice.thu.practice01;

import java.util.Scanner;

/*
경로 탐색(인접행렬)
방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
 */
public class section7_11_01 {
    static int[] ch;
    static int[][] graph;
    static int n, answer = 0;
    static void solution(int l) {
        if (l == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[l][i] == 1 && ch[i] == 0) {
                    ch[l] = 1;
                    solution(i);
                    ch[l] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        ch = new int[n + 1];
        graph = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            graph[s][e] = 1;
        }
        ch[1] = 1;
        solution(1);
        System.out.println(answer);
    }
}
