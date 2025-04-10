package algorithm_practice.practice03.thu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class section7_03_11 {
    static List<ArrayList<Integer>> list = new ArrayList<>();
    static boolean[] visit;
    static int n, answer = 0;
    static void solution(int v) {

        if (v == n) answer++;
        else {
            for (int x : list.get(v)) {
                if (!visit[x]) {
                    visit[x] = true;
                    solution(x);
                    visit[x] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        visit = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            list.get(s).add(e);
        }
        visit[1] = true;
        solution(1);
        System.out.println(answer);
    }
}
