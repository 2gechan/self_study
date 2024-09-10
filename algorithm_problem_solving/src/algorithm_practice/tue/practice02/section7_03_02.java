package algorithm_practice.tue.practice02;

import java.util.Scanner;

public class section7_03_02 {

    static int solution(int n) {
        if (n == 1) return 1;
        else {
            return n * solution(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
