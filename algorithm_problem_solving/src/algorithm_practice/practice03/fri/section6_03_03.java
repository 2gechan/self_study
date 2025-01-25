package algorithm_practice.practice03.fri;

import java.util.Scanner;

public class section6_03_03 {

    static int[] solution(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (tmp < arr[j]) {
                    arr[index] = arr[j];
                    arr[j] = tmp;
                    index = j;
                }
                else break;
            }
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
