package algorithm_practice.thu.practice01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
경로 탐색(인접리스트)
방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
 */
public class section7_12_01 {

    static List<List<Integer>> list = new ArrayList<>();
    static int[] ch;
    static int n, m, answer = 0;

    static void solution(int l) {
        if (l == n) answer++;
        else {
            for (int x : list.get(l)) {
                if (ch[x] == 0) {
                    ch[x] = 1;
                    solution(x);
                    ch[x] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            list.get(s).add(e);
        }
        ch[1] = 1;
        solution(1);
        System.out.println(answer);
    }
}
