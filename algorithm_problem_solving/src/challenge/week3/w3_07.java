package challenge.week3;

import java.util.Scanner;

public class w3_07 {

    static int[][] arr, ch;
    static int n, m;
    static int solution(int x, int y) {

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ch[i][j] != 0) continue;

                if (arr[i][j] == 0) search(i, j, true);
                else search(i, j, false);
                answer++;
            }
        }

        return answer;
    }

    static void search(int x, int y, boolean flag) {

        ch[x][y] = 1;

        if (flag) {
            y++;
            if (y < m && arr[x][y] == 0) search(x, y, true);
        }
        else {
            x++;
            if (x < n && arr[x][y] == 1) search(x, y, false);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        arr = new int[n][m];
        ch = new int[n][m];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                // 가로는 0, 세로는 1
                if (line.charAt(j) == '-') arr[i][j] = 0;
                else arr[i][j] = 1;
            }
        }
        System.out.println(solution(0, 0));
    }
}
