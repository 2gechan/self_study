package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주어진 testCase와 답안은 동일하게 나오는데 오답으로 처리됨
public class d2_2007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(br.readLine());
        int[] resultArr = new int[testCaseCount];
        for (int i = 0; i < testCaseCount; i++) {
            String testCase = br.readLine();
            for (int j = 1; j < testCase.length(); j++) {
                String result = testCase.substring(0, j);
                String temp = testCase.substring(j, j + j);
                if (result.equals(temp) && j <= 10) {
                    resultArr[i] = result.length();
                    break;
                } else {
                    resultArr[i] = 0;
                }
            }
        }
        for (int i = 0; i < resultArr.length; i++) {
            System.out.printf("#%d %d", i+1, resultArr[i]);
        }
    }
}
