package algorithm_practice.tue.practice02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 경로 탐색(인접행렬)
public class section7_10_02 {

    static List<ArrayList<Integer>> list;
    static int n, m, answer = 0;
    static int[] ch;
    static void solution(int num) {

        if (num == n) {
            answer++;
        }
        else {
            for (int x : list.get(num)) {
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
        list = new ArrayList<>();
        ch = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
        }
        ch[1] = 1;
        solution(1);
        System.out.println(answer);
    }
}
