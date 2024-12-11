package baekjoon.silver5;

import java.util.Scanner;

public class Baekjoon1676_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        while (n > 0) {
            answer += n / 5;
            n = n / 5;
        }
        System.out.println(answer);
        /*
        1! = 1 => 1
        2! = 2 x 1 => 2
        3! = 3 x 2 x 1 => 6
        4! = 4 x 3 x 2 x 1 => 24
        5! = 5 x 4 x 3 x 2 x 1 => 120
        6! = 6 x 5 x 4 x 3 x 2 x 1 => 720
        7! = 7 x 6 x 5 x 4 x 3 x 2 x 1 => 5040
        8! = 8 x 7 x 6 x 5 x 4 x 3 x 2 x 1 => 40320
        9! = 9 x 8 x 7 x 6 x 5 x 4 x 3 x 2 x 1 => 362880
        10! = 10(2x5) x 9(3x3) x 8(2x2x2) x 7 x 6(2x3) x 5 x 4(2x2) x 3 x 2 x 1 => 3628800
        15! = 1307674368000
         */
    }
}
