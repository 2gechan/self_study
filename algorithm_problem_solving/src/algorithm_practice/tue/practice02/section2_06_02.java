package algorithm_practice.tue.practice02;

import java.util.Scanner;

// 뒤집은 소수
public class section2_06_02 {
    static void solution(int n, int[] arr) {

        for (int x : arr) {
            String strX = "";
            int tmp = x;
            while (tmp > 0) {
                strX += tmp % 10;
                tmp = tmp / 10;
                // System.out.println(tmp);
            }
            int reverseX = Integer.valueOf(strX);
            if (reverseX == 1) continue;
            boolean flag = true;
            for (int i = 2; i < reverseX; i++) {
                if (reverseX % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.print(reverseX + " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(n, arr);
    }
}
