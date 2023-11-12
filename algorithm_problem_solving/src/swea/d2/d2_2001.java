package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d2_2001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(br.readLine());
        int[] result = new int[testCount];
        int index = 0;
        while (index < testCount) {

            String[] NM = br.readLine().split(" ");

            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);

            int[][] testCase = new int[N][N];

            for (int i = 0; i < testCase.length; i++) {
                String[] line = br.readLine().split(" ");
                for (int j = 0; j < testCase[i].length; j++) {
                    testCase[i][j] = Integer.parseInt(line[j]);
                }
            }

            int max = 0;
            for (int i = 0; i <= N - M; i++) {

                for (int j = 0; j <= N - M; j++) {
                    int temp = 0;

                    for (int x = i; x < i + M; x++) {
                        for (int y = j; y < j + M; y++) {
                            temp += testCase[x][y];
                        }
                    }
                    if (max < temp) {
                        max = temp;
                    }
                }
            }
            result[index] = max;
            index++;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.printf("#%d %d\n", i+1, result[i]);
        }

    }
}
