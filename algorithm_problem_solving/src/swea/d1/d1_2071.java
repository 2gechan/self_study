package swea.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d1_2071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCount = Integer.parseInt(br.readLine());
        int[] resultArr = new int[testCount];
        for (int i = 0; i < testCount; i++) {
            String[] testCases = br.readLine().split(" ");
            int sum = 0;
            for (String item : testCases) {
                int num = Integer.parseInt(item);
                sum += num;
            }
            double result = sum / 10.0;
            resultArr[i] = (int)Math.round(result);
        }
        for (int i=0; i< resultArr.length; i++) {
            System.out.printf("#%d %d\n", i+1, resultArr[i]);
        }

    }
}
