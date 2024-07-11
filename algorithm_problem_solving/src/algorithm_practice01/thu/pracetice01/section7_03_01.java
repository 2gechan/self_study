package algorithm_practice01.thu.pracetice01;

import java.util.Scanner;

/*
팩토리얼
자연수 N이 입력되면 N!를 구하는 프로그램
ex) 5! = 5 x 4 x 3 x 2 x 1 => 120
 */
public class section7_03_01 {
    static int solution(int v, int sum) {
        if (v == 0) return sum;
        else {
            return solution(v - 1, sum * v);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n, 1));
    }
}
