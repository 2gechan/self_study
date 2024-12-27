package algorithm_practice.practice03.fri;

import java.util.Scanner;

public class section6_03_01 {
    static int[] solution(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (num > arr[j]) {
                    num = arr[j];
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
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
