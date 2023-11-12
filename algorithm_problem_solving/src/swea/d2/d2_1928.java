package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

public class d2_1928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int testCount = Integer.parseInt(br.readLine());
         String[] resultArr = new String[testCount];
         for (int i = 0; i < testCount; i++) {
             String testCase = br.readLine();
             String result = new String(Base64.getDecoder().decode(testCase));
             resultArr[i] = result;
         }

         for (int i = 0; i < resultArr.length; i++) {
            System.out.printf("#%d %s\n", i + 1, resultArr[i]);
         }

    }
}
