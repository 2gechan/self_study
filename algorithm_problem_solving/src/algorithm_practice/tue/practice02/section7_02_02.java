package algorithm_practice.tue.practice02;

import java.util.Scanner;

public class section7_02_02 {
    static void solution(int n) {
        if (n == 0) return;
        solution(n / 2);
        System.out.print(n % 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
}
