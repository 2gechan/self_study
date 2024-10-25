package challenge2.week3;

import java.util.Scanner;

public class w3_05 {

    static int r, c;
    static String[][] map;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int solution(int roadCnt) {
        int answer = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (map[i][j].equals(".")) {
                    int cnt = 0;
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx >= 0 && nx < r && ny >= 0 && ny < c && map[nx][ny].equals(".")) {
                            cnt++;
                        }
                    }
                    if (cnt > 1) answer++;
                }
            }
        }

        return answer == roadCnt ? 0 : 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        sc.nextLine();

        map = new String[r][c];
        int roadCnt = 0;
        for (int i = 0; i < r; i++) {
            String[] line = sc.nextLine().split("");
            for (int j = 0; j < c; j++) {
                map[i][j] = line[j];
                if (map[i][j].equals(".")) roadCnt++;
            }
        }
        System.out.println(solution(roadCnt));
    }
}
