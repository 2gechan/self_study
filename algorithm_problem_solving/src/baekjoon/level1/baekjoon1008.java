package baekjoon.level1;

import java.util.Scanner;

// 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
public class baekjoon1008 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 1 >> ");
        int number1 = scan.nextInt();
        System.out.print("정수 2 >> ");
        int number2 = scan.nextInt();

        System.out.printf("%d / %d = %f", number1, number2, (float)number1 / (float)number2);
    }
}
