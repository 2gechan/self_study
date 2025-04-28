package baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon14888 {

    static int n, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    static int[] numbers;
    static int[] calculator;
    static void solution(int l, int result) {

        if (l == n) {

            min = Math.min(min, result);
            max = Math.max(max, result);

            return;
        }

        for (int i = 0; i < 4; i++) {

            if (calculator[i] > 0) {

                calculator[i]--;

                switch (i) {

                    case 0: solution(l + 1, result + numbers[l]); break;
                    case 1: solution(l + 1, result - numbers[l]); break;
                    case 2: solution(l + 1, result * numbers[l]); break;
                    case 3: solution(l + 1, result / numbers[l]); break;
                }

                calculator[i]++;
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.valueOf(br.readLine());
        numbers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.valueOf(st.nextToken());
        }
        calculator = new int[4];
        // 덧셈, 뺄셈, 곱셈, 나눗셈
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            calculator[i] = Integer.valueOf(st.nextToken());
        }
        solution(1, numbers[0]);

        System.out.println(max);
        System.out.println(min);

    }
}
