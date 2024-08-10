package challenge.week1;

import java.util.Arrays;
import java.util.Scanner;

public class w1_06 {

    static void solution(int[] arr) {

        boolean flag = true;
        while (flag) {

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;

                    for (int x : arr) System.out.print(x + " ");
                    System.out.println();
                }
                if (arr[0] == 1 && arr[1] == 2 && arr[2] == 3
                        && arr[3] == 4 && arr[4] == 5) {
                    flag = false;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
    }
}
