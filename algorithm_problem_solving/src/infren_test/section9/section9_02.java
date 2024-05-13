package infren_test.section9;

import java.util.Arrays;
import java.util.Scanner;

public class section9_02 {

    static int solution(int[][] schedule) {
        int answer = 0;
        Arrays.sort(schedule, (s1, s2) -> {
            if (s1[1] == s2[1]) return s1[0] - s2[0];
            else return s1[1] - s2[1];
        });
        int et = 0;
        for (int i = 0; i < schedule.length; i++) {
            if (schedule[i][0] >= et) {
                answer++;
                et = schedule[i][1];
            }

        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] schedule = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                schedule[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(schedule));
    }
}
