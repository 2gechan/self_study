package baekjoon.bronze2;

import java.util.Scanner;

public class Bronze2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a * b * c;

        int[] arr = new int[10];
        while (result > 0) {
            int m = result % 10;
            result = result / 10;
            arr[m]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
