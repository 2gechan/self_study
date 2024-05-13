package infren_test.section9;

import java.util.Arrays;
import java.util.Scanner;

public class section9_01 {
    static int solution(int[][] entry) {
        int answer = 0;
        Arrays.sort(entry, (s1, s2) -> {
            return s1[0] - s2[0];
        });
        for (int i = 0; i < entry.length; i++) {
            boolean chk = false;
            for (int j = i + 1; j < entry.length; j++) {
                if (entry[i][1] < entry[j][1]) {
                    chk = true;
                    break;
                }
            }
            if (!chk) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] entry = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                entry[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(entry));
    }
}
