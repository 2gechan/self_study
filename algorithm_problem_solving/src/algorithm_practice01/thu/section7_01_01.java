package algorithm_practice01.thu;

import java.util.Scanner;

/*
재귀함수
자연수 n을 입력받아 재귀함수를 이용하여 1부터 n까지 출력
 */
public class section7_01_01 {

    static void solution(int m) {
        if (m == 0) return;
        else {
            solution(m - 1);
            System.out.print(m + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
}
