package algorithm_practice.wed.practice02;

import java.util.Scanner;

public class section3_01_02 {
    static int[] solution(int[] arr1, int[] arr2) {
        int[] answer = new int[arr1.length + arr2.length];
        int a1 = 0, a2 = 0, index = 0;
        while (a1 < arr1.length && a2 < arr2.length) {
            if (arr1[a1] < arr2[a2]) answer[index++] = arr1[a1++];
            else answer[index++] = arr2[a2++];
        }
        while (a1 < arr1.length) answer[index++] = arr1[a1++];
        while (a2 < arr2.length) answer[index++] = arr2[a2++];

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int x : solution(arr1, arr2)) System.out.print(x + " ");
    }
}
