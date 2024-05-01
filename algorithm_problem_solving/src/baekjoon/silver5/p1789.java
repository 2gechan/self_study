package baekjoon.silver5;

import java.util.Scanner;

public class p1789 {
    static long solution(long s) {
        long sum = 0;
        long answer = 0;
        for (int i = 1; ; i++) {
            if (sum > s) break;
            sum += i;
            answer++;
        }
        return answer - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        System.out.println(solution(s));
    }
}
