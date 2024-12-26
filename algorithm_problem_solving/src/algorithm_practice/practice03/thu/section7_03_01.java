package algorithm_practice.practice03.thu;

import java.util.Scanner;

public class section7_03_01 {
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
