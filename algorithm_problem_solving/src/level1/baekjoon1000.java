package level1;

import java.util.Scanner;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
public class baekjoon1000 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 정수 >> ");
        int number1 = scan.nextInt();

        System.out.print("두번째 정수 >> ");
        int number2 = scan.nextInt();

        System.out.printf("%d + %d = %d",number1, number2, number1 + number2);
    }
}
