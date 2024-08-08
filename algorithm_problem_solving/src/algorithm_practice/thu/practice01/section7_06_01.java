package algorithm_practice.thu.practice01;

import java.util.Scanner;

/*
부분집합 구하기(DFS)
자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.
 */
public class section7_06_01 {

    static int n;
    static int[] ch;

    static void solution(int l) {
        if (l == n + 1) {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) System.out.print(i + " ");
            }
            System.out.println();
        }
        else {
                ch[l] = 1;
                solution(l + 1);
                ch[l] = 0;
                solution(l + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new int[n + 1];
        solution(1);
    }
}
