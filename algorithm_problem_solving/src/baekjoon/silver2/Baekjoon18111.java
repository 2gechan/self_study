package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken()); // 세로
        int M = Integer.valueOf(st.nextToken()); // 가로
        int B = Integer.valueOf(st.nextToken()); // 인벤토리에있는 벽돌
        int[][] arr = new int[N][M];

        int low = Integer.MAX_VALUE;
        int high = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.valueOf(st.nextToken());
                low = Math.min(arr[i][j], low);
                high = Math.max(arr[i][j], high);
            }
        }

        int time = Integer.MAX_VALUE;
        int height = 0;
        for (; low <= high; low++) {
            int count = 0;
            int block = B;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] > low) {
                        count += (arr[i][j] - low) * 2;
                        block += (arr[i][j] - low);
                    }
                    else {
                        count += (low - arr[i][j]) * 1;
                        block -= (low - arr[i][j]);
                    }
                }
            }

            if (block >= 0) {
                if (time >= count) {
                    time = count;
                    height = low;
                }
            }

        }

        System.out.println(time + " " + height);

    }
}
