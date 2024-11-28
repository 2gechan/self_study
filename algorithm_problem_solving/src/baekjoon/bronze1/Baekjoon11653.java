package baekjoon.bronze1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = n;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        /*
        for (int i = 2; i < Math.sqrt(tmp); i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        if (n != 1) System.out.println(n);
         */
    }
}
