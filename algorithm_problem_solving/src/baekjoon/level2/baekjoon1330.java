package baekjoon.level2;

import java.util.Scanner;

// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
public class baekjoon1330 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 1 >> ");
        int num1 = scan.nextInt();
        System.out.print("정수 2 >> ");
        int num2 = scan.nextInt();
        if (num1 > num2) {
            System.out.println(">");
        } else if (num1 < num2) {
            System.out.println("<");
        } else if (num1 == num2) {
            System.out.println("==");
        }
    }
}
