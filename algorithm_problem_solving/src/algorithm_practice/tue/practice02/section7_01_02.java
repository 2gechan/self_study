package algorithm_practice.tue.practice02;

import java.util.Scanner;

public class section7_01_02 {

    static void solution(int l) {
        if (l == 0) return;
        else {
            solution(l - 1);
            System.out.print(l + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
}
