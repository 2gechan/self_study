package infren.section9;

import java.util.Scanner;

// dynamic 소규모부터 차근차근 올라가는것
// 계단오르기 경우의수, 피보나치 수열사용
public class section9_09 {
    static int[] dy;
    static int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        return dy[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n + 1];
        System.out.println(solution(n));

    }
}
