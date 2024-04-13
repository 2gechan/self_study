package baekjoon.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p2609 {
    static int[] solution1(int n, int m) {
        int[] answer = new int[2];
        List<Integer> list = new ArrayList<>();
        if (n >= m) {
            for (int i = m; i > 0; i--) {
                if (m % i == 0) list.add(i);
            }
            for (int i = 0; i < list.size(); i++) {
                if (n % list.get(i) == 0) {
                    answer[0] = list.get(i);
                    break;
                }
            }
        } else {
            for (int i = n; i > 0; i--) {
                if (n % i == 0) list.add(i);
            }
            for (int i = 0; i < list.size(); i++) {
                if (m % list.get(i) == 0) {
                    answer[0] = list.get(i);
                    break;
                }
            }
        }
        int idx1 = 2, idx2 = 2, a = n, b = m;
        while (a != b) {
            if (a > b) {
                b = m * idx2;
                idx2++;
            }
            else {
                a = n * idx1;
                idx1++;
            }
        }
        answer[1] = a;

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int x : solution1(n, m)) System.out.println(x);
    }
}
