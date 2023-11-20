package baekjoon.level1;

/*
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
      4 7 2  <-- (1)
    x 3 8 5  <-- (2)
-----------
    2 3 6 0  <-- (3)
  3 7 7 6    <-- (4)
1 4 1 6      <-- (5)
-----------
1 8 1 7 2 0  <-- (6)
(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class baekjoon2588 {

    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.print("정수 1 >> ");
        int num1 = scan.nextInt();
        System.out.print("정수 2 >> ");
        int num2 = scan.nextInt();

        int h = num2 / 100;
        int t = (num2 % 100) / 10;
        int o = (num2 % 10);

        System.out.println(num1 * o);
        System.out.println(num1 * t);
        System.out.println(num1 * h);
        System.out.println(num1 * num2);

    }
}
