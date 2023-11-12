package swea.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d1_2046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String testCase = "";
        for (int i = 0; i < T; i++) {
            testCase += "#";
        }
        System.out.println(testCase);

    }
}
