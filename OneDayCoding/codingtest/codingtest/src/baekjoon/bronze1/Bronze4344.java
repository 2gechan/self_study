package baekjoon.bronze1;

import java.util.Scanner;

public class Bronze4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            float sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            double avg = sum / n;

            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > avg) cnt++;
            }
            double rate = (double) cnt / (double) n * 100.0;

            System.out.printf("%.3f", rate);
            System.out.println("%");


        }
    }
}
