package baekjoon.silver5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p1094 {
    static int solution(int n, int x) {
        int cnt = 0;
        while (x > 0) {
            if (n > x) n /= 2;
            else {
                x -= n;
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(64, n));

    }
}
