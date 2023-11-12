package swea.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d1_2058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] testCase = br.readLine().split("");
        int testCaseLength = testCase.length;
        int result = 0;
        for (int i = 0; i < testCaseLength; i++) {
            result += Integer.parseInt(testCase[i]);
        }
        System.out.println(result);
    }
}
