package algorithm_practice.wed.practice02;

import java.util.Scanner;

// 조합의 경우수(메모이제이션)
public class section8_07_02 {
    static int[][] memory;

    static int solution(int n, int r) {
        if (memory[n][r] != 0) return memory[n][r];
        if (n == r || r == 0) return memory[n][r] = 1;
        else return memory[n][r] = solution(n - 1, r - 1) + solution(n - 1, r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        memory = new int[n + 1][r + 1];
        System.out.println(solution(n, r));
    }
}
