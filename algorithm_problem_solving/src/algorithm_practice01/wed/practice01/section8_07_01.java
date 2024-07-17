package algorithm_practice01.wed.practice01;

import java.util.Scanner;

/*
조합의 경우수(메모이제이션)
nCr = n! / (n-r)!r! 로 계산합니다.
하지만 여러분은 이 공식을 쓰지않고 다음 공식을 사용하여
재귀를 이용해 조합수를 구해주는 프로그램을 작성하세요.
nCr = n-1Cr-1 + n-1Cr
 */
public class section8_07_01 {

    static int[][] dy;

    static int solution(int n, int r) {
        if (dy[n][r] != 0) return dy[n][r];
        if (n == r || r == 0) return dy[n][r] = 1;
        else {
            return dy[n][r] = solution(n - 1, r - 1) + solution(n - 1, r);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        dy = new int[n + 1][r + 1];
        System.out.println(solution(n, r));
    }
}
