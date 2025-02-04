package algorithm_practice.practice03.tue;

import java.util.Scanner;

public class section2_03_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i <= N; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
