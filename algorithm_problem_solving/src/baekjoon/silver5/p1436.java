package baekjoon.silver5;

import java.util.Scanner;

public class p1436 {
    static int solution(int n) {
        int count = 1;
        int num = 666;
        while (count != n) {
            num++;
            if (String.valueOf(num).contains("666")) count++;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
