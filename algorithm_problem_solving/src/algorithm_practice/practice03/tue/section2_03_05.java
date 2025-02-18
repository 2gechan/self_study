package algorithm_practice.practice03.tue;

import java.util.Scanner;

public class section2_03_05 {

    static int solution(int n) {
        int answer = 0;

        boolean[] chk = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (chk[i]) continue;
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            for (int k = i; k <= n; k += k) {
                chk[k] = true;
            }
            if (flag) answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
