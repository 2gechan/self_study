package challenge2.week1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class w1_06 {

    static long solution(int n, int[][] trees) {
        long answer = 0;
        Arrays.sort(trees, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        for (int i = 0; i < n; i++) {
            // 현재 나무의 길이 + 날짜별 나무의 성장된 길이
            answer += trees[i][0] + (trees[i][1] * i);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 나무의 초기값
        int[][] trees = new int[n][2];
        for (int i = 0; i < n; i++) {
            trees[i][0] = sc.nextInt();
        }
        // 성장률
        for (int i = 0; i < n; i++) {
            trees[i][1] = sc.nextInt();
        }
        System.out.println(solution(n, trees));

    }

}
