package challenge.week3;

import java.util.Scanner;

public class w3_04 {

    static int [][] apt;
    static void solution(int k, int n, int l) {

        if (l == k + 1) return;
        else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    apt[l][i] += apt[l - 1][j];
                }
            }
            solution(k, n, l + 1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {

            int k = sc.nextInt();
            int n = sc.nextInt();

            // 0층부터 k층까지 존재, n호수 까지 계산 필요
            apt = new int[k + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                apt[0][i] = i;
            }
            solution(k, n, 1);
            System.out.println(apt[k][n]);

            T--;
        }
    }
}
