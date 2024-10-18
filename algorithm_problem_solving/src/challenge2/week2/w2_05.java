package challenge2.week2;

import java.util.Scanner;

public class w2_05 {

    // 0(A) : 5(F), 1(B) : 3(D), 2(C) : 4(E) 서로 반대편 인덱스
    static int[] reverse = {5, 3, 4, 1, 2, 0};
    static int[][] arr;
    static int n, answer = 0;

    static void solution(int l, int up, int sum) {
        int max = sideMaxNum(l, up);
        int rvs = reverse[up];
        if (l == n - 1) {
            answer = Math.max(answer, sum + max);
            return;
        }
        for (int i = 0; i < 6; i++) {
            if (arr[l + 1][i] == arr[l][rvs]) {
                solution(l + 1, i, sum + max);
                break;
            }
        }

    }

    static int sideMaxNum(int row, int index) {
        int max = 0;
        for (int i = 0; i < 6; i++) {
            if (i == index || i == reverse[index]) continue;
            max = Math.max(max, arr[row][i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][6];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");
            for (int j = 0; j < 6; j++) {
                arr[i][j] = Integer.valueOf(line[j]);
            }
        }
        // 첫 주사위 놓기
        for (int i = 0; i < 6; i++) {
            solution(0, i, 0);
        }
        solution(0, 0, 0);
        System.out.println(answer);
    }
}
