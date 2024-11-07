package algorithm_practice.wed.practice02;

import java.util.Scanner;

// 조합 구하기
public class section8_09_02 {

    static int n, m;
    static int[] result;
    static void solution(int l, int index) {
        if (l == m) {
            for (int x : result) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else {
            for (int i = index; i <= n; i++) {
                result[l] = i;
                solution(l + 1, i + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        result = new int[m];

        solution(0, 1);
    }
}
