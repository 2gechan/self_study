package infren.section6;

import java.util.Arrays;
import java.util.Scanner;

public class section6_05 {
    static String solution(int[] t, int n) {
        String answer = "U";
        Arrays.sort(t);
        for (int i = 0; i < n - 1; i++) {
            if (t[i] == t[i + 1]) {
                return "D";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        System.out.println(solution(t, n));
    }
}
