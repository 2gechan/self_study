package swea.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d1_2072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        int[] resultArr = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            int sum = 0;
            String[] strNums = br.readLine().split(" ");
            for (int j = 0; j < strNums.length; j++) {
                int num = Integer.parseInt(strNums[j]);
                if (num % 2 != 0) {
                    sum += num;
                }
            }
            resultArr[i] = sum;
        }
        for (int i = 0; i< resultArr.length; i++) {
            System.out.printf("#%d %d\n", i+1, resultArr[i]);
        }

    }
}
