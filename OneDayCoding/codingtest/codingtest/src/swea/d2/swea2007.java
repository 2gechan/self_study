package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea2007 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        for (int j = 1; j <= t; j++) {
            String testCase = br.readLine().trim();
            for (int i = 1; i < testCase.length() - 1; i++) {
                String word = testCase.substring(0, i);
                String tmp = testCase.substring(i, i + i);
                if (word.equals(tmp)) {
                    sb.append("#" + j + " ").append(word.length()).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb.toString());

    }
}
