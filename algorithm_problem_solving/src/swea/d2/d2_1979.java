package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d2_1979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(br.readLine());
        int[] resultArr = new int[testCount];

        int index = 0;
        while (index < testCount) {
            String[] NK = br.readLine().split(" ");
            int N = Integer.parseInt(NK[0]);
            int K = Integer.parseInt(NK[1]);
            int[][] testCase = new int[N][N];

            int result = 0;

            for (int i = 0; i < N; i++) {
                int count = 0;
                String[] sample = br.readLine().split(" ");
                for (int j = 0; j < N; j++) {
                    int tc = Integer.parseInt(sample[j]);
                    int nextTc = j + 1 < N ? Integer.parseInt(sample[j + 1]) : 0;
                    if (tc == 1) {
                        count++;
                    } else if (tc == 0) {
                        count = 0;
                    }
                    if (count == K && nextTc == 0) {
                        result++;
                        count = 0;
                    }

                    testCase[i][j] = Integer.parseInt(sample[j]);
                }

            }

            // 세로 일치
            for (int j = 0; j < N; j++) {
                int count = 0;
                for (int i = 0; i < N; i++) {
                    if (testCase[i][j] == 1) {
                        count++;
                    } else if(testCase[i][j] == 0) {
                        count = 0;
                    }
                    int nextTc = i + 1 < N ? testCase[i + 1][j] : 0;

                    if (count == K && nextTc == 0) {
                            result ++;
                            count = 0;
                    }
                }

            }
            resultArr[index] = result;
            index++;
        }

        for (int i = 0; i < testCount; i++) {
            System.out.printf("#%d %d\n", i + 1, resultArr[i]);
        }

    }
}
