package algorithm_practice.mon.practice02;

import java.util.Scanner;

public class section6_02_02 {

    static int[] solution(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            // 버블 정렬은 맨끝부터 맞춰지기 때문에 반복한 횟수만큼 최대 반복 수를 줄여주면 된다.
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
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
