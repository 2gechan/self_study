package algorithm_practice01.wed.practice01;

import java.util.Scanner;

/*
수열 추측하기
가장 윗줄에 1부터 N까지의 숫자가 한 개씩 적혀 있다.
그리고 둘째 줄부터 차례대로 파스칼의 삼각형처럼 위의 두개를 더한 값이 저장되게 된다.
예를 들어 N이 4 이고 가장 윗 줄에 3 1 2 4 가 있다고 했을 때, 다음과 같은 삼각형이 그려진다.
3 1 2 4
 4 3 6
  7 9
   16
N과 가장 밑에 있는 숫자가 주어져 있을 때 가장 윗줄에 있는 숫자를 구하는 프로그램을 작성하시오.
단, 답이 여러가지가 나오는 경우에는 사전순으로 가장 앞에 오는 것을 출력하여야 한다.

 */
public class section8_08_01 {
    static int n, f;
    static int[] b, p, ch;
    static boolean flag = false;

    static int[][] dy = new int[35][35];
    static int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else {
            return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }
    }

    static void solution(int l, int sum) {
        if (flag) return;
        if (l == n) {
            if (sum == f) {
                for (int x : p) System.out.print(x + " ");
                flag = true;
            }
        }
        else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[l] = i;
                    solution(l + 1, sum + (p[l] * b[l]));
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i] = combi(n - 1, i);
        }
        solution(0, 0);
    }
}
