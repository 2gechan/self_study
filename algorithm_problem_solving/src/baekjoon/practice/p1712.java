package baekjoon.practice;

import java.util.Scanner;

public class p1712 {
    static long solution(long a, long b, long c) {
        long answer = 0;
        if (b >= c) answer = -1;
        else {
            answer = a / (c - b) + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(); // 고정 지출 비용
        long b = sc.nextInt(); // 노트북 한대를 생상하는데 드는 비용
        long c = sc.nextInt(); // 노트북 한대의 판매 가격
        System.out.println(solution(a, b, c));
    }
}
