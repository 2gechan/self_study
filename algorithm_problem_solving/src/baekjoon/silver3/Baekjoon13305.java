package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon13305 {

    static long solution(int n, long[] road, long[] cost) {
        long answer = 0;

        long min = cost[0];
        for (int i = 0; i < n - 1; i++) {
            if (cost[i] < min) {
                min = cost[i];
            }

            answer += (road[i] * min);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        long[] road = new long[n];
        String[] sRoad = br.readLine().split(" ");
        for (int i = 0; i < n - 1; i++) {
            road[i] = Integer.valueOf(sRoad[i]);
        }

        long[] cost = new long[n];
        String[] sCost = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            cost[i] = Integer.valueOf(sCost[i]);
        }

        System.out.println(solution(n, road, cost));
    }
}
