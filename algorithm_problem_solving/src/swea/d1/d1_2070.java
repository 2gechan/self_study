package swea.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d1_2070 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] resultArr = new String[T];
        for (int i = 0; i < T; i++) {
            String[] testCase = br.readLine().split(" ");
            int num1 = Integer.parseInt(testCase[0]);
            int num2 = Integer.parseInt(testCase[1]);
            if (num1 > num2) {
                resultArr[i] = ">";
            } else if (num2 > num1) {
                resultArr[i] = "<";
            } else {
                resultArr[i] = "=";
            }
        }
        for (int i = 0; i < resultArr.length; i++) {
            System.out.printf("#%d %s\n", i + 1, resultArr[i]);
        }
    }
}
