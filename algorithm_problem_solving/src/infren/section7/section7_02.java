package infren.section7;

import java.util.Scanner;

// 10진수 n이 입력되면 2진수로 변환하여 출력하는 재귀 함수
public class section7_02 {
    static void solution(int n) {
        if (n == 0) return;
        else {
            solution(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
        /*
        2 - 11
            5  - 1 ^
            2  - 1 |
            1  - 0 |
            0  - 1 |
         */
    }
}
