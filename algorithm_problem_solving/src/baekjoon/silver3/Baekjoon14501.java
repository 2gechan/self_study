package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon14501 {

    static int N, answer = 0;
    static int[][] arr;

    static void solution(int day, int sum) {

        for (int i = day; i <= N; i++) {
            int cost = arr[i][0];
            int money = arr[i][1];
            if (i + cost <= N + 1) { // 소요기간에는 당일에도 수행할 수 있기 때문에 N + 1까지는 허용
                answer = Math.max(answer, sum + money);
                solution(i + cost, sum + money);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.valueOf(br.readLine());
        arr = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            String[] line = br.readLine().split(" ");
            arr[i][0] = Integer.valueOf(line[0]);
            arr[i][1] = Integer.valueOf(line[1]);
        }
        solution(1, 0);
        System.out.println(answer);
    }
}
