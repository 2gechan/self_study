package infren.section7;

import java.util.Scanner;

// n을 입력하면 1부터 n까지 출력하는 재귀 함수
public class section7_01 {
    static void solution(int n) {
        if (n == 0) return;
        else {
            solution(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
}
