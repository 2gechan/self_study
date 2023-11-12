package swea.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d1_2068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        int[] resultArr = new int[T];
        for (int i = 0; i < T; i++) {
            String[] testCase = br.readLine().split(" ");

            int maxNum = 0;
            for (int j = 0; j < testCase.length; j++) {
                int num = Integer.parseInt(testCase[j]);
                if (maxNum < num) {
                    maxNum = num;
                }
            }
            resultArr[i] = maxNum;
        }
        for (int i = 0; i < T; i++) {
            System.out.printf("#%d %d\n", i + 1, resultArr[i]);
        }
    }
}
