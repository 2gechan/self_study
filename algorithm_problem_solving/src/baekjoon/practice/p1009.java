package baekjoon.practice;

import java.util.Scanner;

public class p1009 {
    static int solution(int a, int b) {
        int result = a % 10; // a의 1제곱
        for (int i = 1; i < b; i++) { // a의 2제곱부터 시작해서 b제곱까지
            result = (result * a) % 10;
            // 1의자리만 구하면 몇번째 컴퓨터에서 처리하는지 알 수 있음
        }
        if (result == 0) return 10;
        else return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(solution(a, b));
        }

    }
}
