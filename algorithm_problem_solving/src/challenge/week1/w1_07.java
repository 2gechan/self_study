package challenge.week1;

import java.util.Scanner;

public class w1_07 {
    static int[] solution(int n, int[][] arr) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int cw = arr[i][0];
            int ch = arr[i][1];
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (cw < arr[j][0] && ch < arr[j][1]) cnt++;
            }
            result[i] = cnt;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for (int x : solution(n, arr)) System.out.print(x + " ");
    }
}
