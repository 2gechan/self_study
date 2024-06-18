package algorithm_practice01.mon;

import java.util.Scanner;

public class section10_01_01 {
    static int solution(int n, int[] dy) {
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 1] + dy[i - 2];
        }

        return dy[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dy = new int[n + 1];
        dy[1] = 1;
        dy[2] = 2;
        System.out.println(solution(n, dy));
    }
}
