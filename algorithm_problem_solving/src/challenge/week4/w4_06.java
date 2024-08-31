package challenge.week4;

import java.util.ArrayList;
import java.util.Scanner;

public class w4_06 {

    static int[][] arr;
    static boolean[] visit;

    static void solution(int index) {
        visit[index] = true;
        for (int i = 1; i < arr[index].length; i++) {
            if (!visit[i] && arr[index][i] == 1) solution(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[n + 1][n + 1];
        visit = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                solution(i);
                answer++;
            }
        }
        System.out.println(answer);
    }
}
