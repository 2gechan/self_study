package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
// o o x x o o x x o  o x  x  o  o  x
public class Baekjoon4796 {

    static int solution(String[] testCase) {
        int answer = 0;

        int L = Integer.valueOf(testCase[0]);
        int P = Integer.valueOf(testCase[1]);
        int V = Integer.valueOf(testCase[2]);
        int divide = V / P;
        answer += (divide * L);
        int remainder = V % P;
        if (remainder >= L) answer += L;
        else answer += remainder;

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        while (true) {
            String[] testCase = br.readLine().split(" ");
            if (testCase[0].equals("0") && testCase[1].equals("0") && testCase[2].equals("0")) break;

            int result = solution(testCase);
            sb.append("Case " + cnt + ": " + result + "\n");
            cnt++;
        }
        System.out.println(sb.toString());
    }
}
