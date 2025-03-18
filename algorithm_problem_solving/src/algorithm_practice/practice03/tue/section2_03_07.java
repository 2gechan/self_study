package algorithm_practice.practice03.tue;

import java.util.Scanner;

public class section2_03_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) cnt++;
            else cnt = 0;
            answer += cnt;
        }
        System.out.println(answer);

    }
}
