package baekjoon.practice;

import java.util.Scanner;

public class p1943 {
    static int gcd(int a, int b) { // 최대 공약수 구하는 공식
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    static int solution(int a, int b) {
        // 최소 공배수 구하는 공식
        // (a * b) / 최대 공약수
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(solution(a, b));
        }
    }
}
