package algorithm_practice.practice03.tue;

import java.util.Scanner;

public class section2_03_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int grade = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) grade++;
            }
            result[i] = grade;
        }
        for (int x : result) System.out.print(x + " ");
    }
}
