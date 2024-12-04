package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1357 {

    static int numReverse(int num) {
        int result;
        StringBuilder sb = new StringBuilder(num+"");
        result = Integer.valueOf(sb.reverse().toString());

        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] testCase = br.readLine().split(" ");
        int X = Integer.valueOf(testCase[0]);
        int Y = Integer.valueOf(testCase[1]);
        X = numReverse(X);
        Y = numReverse(Y);

        int tmp = X + Y;
        tmp = numReverse(tmp);

        int answer = Integer.valueOf(tmp);
        System.out.println(answer);

    }
}
