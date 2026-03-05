package baekjoon.bronze2;

import java.util.Scanner;

public class Bronze1978 {

    static boolean prime(int n) {
        boolean result = true;
        if (n < 2) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                result = false;
                break;
            }
        }

        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 0;
        while (t-- > 0) {
            int n = sc.nextInt();

            if (prime(n)) cnt++;
        }
        System.out.println(cnt);
    }
}
