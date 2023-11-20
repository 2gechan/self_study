package baekjoon.level1;

import java.util.Scanner;

// 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
public class baekjoon10869 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수1 >> ");
        int number1 = scan.nextInt();
        System.out.print("정수2 >> ");
        int number2 = scan.nextInt();

        System.out.printf("%d, %d 덧셈 : %d\n", number1, number2, number1 + number2);
        System.out.printf("%d, %d 뺄셈 : %d\n", number1, number2, number1 - number2);
        System.out.printf("%d, %d 곱셈 : %d\n", number1, number2, number1 * number2);
        System.out.printf("%d, %d 몫 : %d\n", number1, number2, number1 / number2);
        System.out.printf("%d, %d 나머지 : %d", number1, number2, number1 % number2);
    }
}
