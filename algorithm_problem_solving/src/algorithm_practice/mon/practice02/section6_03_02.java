package algorithm_practice.mon.practice02;

import java.util.Scanner;

public class section6_03_02 {

    static int[] solution(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (num < arr[j]) {
                    arr[j + 1] = arr[j];
                }
                else break;
            }
            arr[j + 1] = num;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(arr)) System.out.print(x + " ");
    }
}
