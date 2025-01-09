package algorithm_practice.practice03.thu;

import java.util.Scanner;

public class section7_03_02 {

    static String answer = "";
    static void solution(int n) {
        if (n == 1) answer += n;
        else {
            solution(n / 2);
            answer += n % 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
        System.out.println(answer);
    }
}
