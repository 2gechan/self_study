package challenge2.week1;

import java.util.HashSet;
import java.util.Scanner;

public class w1_03 {
    static int[][] arr;
    static HashSet<String> set = new HashSet<>();
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static void solution(int l, String result, int x, int y) {
        if (l == 6) {
            set.add(result);
        }
        else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < 5 && ny >= 0 && ny < 5) {
                    String tmp = result + arr[x][y];
                    solution(l + 1, tmp, nx, ny);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        String result = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                solution(0, result, i, j);
            }
        }

        System.out.println(set.size());
    }
}
