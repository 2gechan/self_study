package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon13241 {
    static long solution(long A, long B) {
        long mod = 0;

        while (B != 0) {
            mod = A % B;
            A = B;
            B = mod;
        }

        return A;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        long A = Integer.valueOf(line[0]);
        long B = Integer.valueOf(line[1]);
        StringBuilder sb = new StringBuilder();
        if (A > B) {
            sb.append( A * B / solution(A, B) + "");
        }
        else if (B > A) {
            sb.append( A * B / solution(B, A) + "");
        }
        else {
            sb.append(A + "");
        }
        System.out.println(sb);
    }
}
