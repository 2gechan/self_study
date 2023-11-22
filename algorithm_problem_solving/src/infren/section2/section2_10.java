package infren.section2;

import java.util.Scanner;

public class section2_10 {
    static int solution(int[][] t, int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int num = t[i][j];
                // 위 t[i - 1][j];
                // 아래 t[i+1][j];
                // 왼쪽 t[i][j-1];
                // 오른쪽 t[i][j+1];
                if (num > t[i - 1][j] && num > t[i + 1][j] && num > t[i][j - 1] && num > t[i][j + 1]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] t = new int[n + 2][n + 2];
        for (int i = 1; i <= n; i++) {
            String[] tc = sc.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                t[i][j + 1] = Integer.parseInt(tc[j]);
            }
        }
        System.out.println(solution(t, n));
    }
}
