package algorithm_practice01.wed.practice01;

import java.util.Arrays;
import java.util.Scanner;

public class section3_01_01 {
    static int[] solution(int[] arr1, int[] arr2) {
        int[] answer = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            answer[i] = arr1[i];
        }
        int index = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            answer[index++] = arr2[i];
        }
        Arrays.sort(answer);

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
