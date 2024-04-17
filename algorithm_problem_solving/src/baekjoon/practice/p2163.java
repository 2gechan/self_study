package baekjoon.practice;

import java.util.Scanner;

public class p2163 {
    static int solution(int n, int m) {
        int answer = 0;
        if (n == 1 && m == 1) return answer;
        else {
            answer = n * m - 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(solution(n, m));
    }
}
