package infren.section9;

import java.util.Scanner;

// dynamic
// 개울 건너기 경우의 수, 피보나치 수열 이용
// *주의 : 개울을 건너는 경우의 수 이므로 돌의 개수가 아닌 돌을 지나 건너편 땅에 딛는 경우의 수
public class section9_10 {
    static int[] dy;

    static int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        return dy[n] + dy[n - 1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n + 1];
        System.out.println(solution(n));
    }
}
