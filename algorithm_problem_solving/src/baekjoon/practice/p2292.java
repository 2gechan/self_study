package baekjoon.practice;

import java.util.Scanner;

public class p2292 {
    static int solution(int n) {
        int answer = 0, level = 1, min = 2, range;
        if (n == 1) return 1;
        while (true) {
            range = min + level * 6;
            level++;
            if (n < range) {
                answer = level;
                break;
            }
            min = range;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
