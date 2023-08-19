package level3;

import java.util.Scanner;

// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
public class baekjoon8393 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
