package baekjoon.silver5;

import java.util.Scanner;

public class p1476 {
    static int solution(int e, int s, int m) {
        int answer = 1;
        int ee = 1;
        int ss = 1;
        int mm = 1;
        while (ee != e || ss != s || mm != m) {
            ee++; ss++; mm++;
            if (ee > 15) ee = 1;
            if (ss > 28) ss = 1;
            if (mm > 19) mm = 1;
            answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(solution(e, s, m));
    }
}
