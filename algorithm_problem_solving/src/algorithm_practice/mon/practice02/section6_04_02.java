package algorithm_practice.mon.practice02;

import java.util.Scanner;

public class section6_04_02 {

    static int[] solution(int s, int[] work) {
        int[] arr = new int[s];

        for (int i = 0; i < work.length; i++) {
            int num = work[i];
            boolean flag = true;
            for (int j = 0; j < s; j++) {
                if (arr[j] == num) {
                    flag = false;
                    for (int z = j; z > 0; z--) {
                        arr[z] = arr[z - 1];
                    }
                    arr[0] = num;
                    break;
                }
            }
            if (flag) {
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = num;
            }
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        return arr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] work = new int[n];
        for (int i = 0; i < n; i++) {
            work[i] = sc.nextInt();
        }
        for (int x : solution(s, work)) System.out.print(x + " ");
    }
}
