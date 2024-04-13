package baekjoon.practice;

import java.util.Scanner;

public class p1110 {
    static int solution(int n) {
        int answer = 0;
        int chk = n;
        while (true) {
            int sib = chk / 10;
            int il = chk % 10;
            int sum = sib + il;
            int na = sum % 10;
            chk = il * 10 + na;
            answer++;
            if (chk == n) break;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
