package baekjoon.bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class Bronze10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        String line = sc.nextLine();
        // a = 97
        int index = -1;
        for (char c : line.toCharArray()) {
            index++;
            if (arr[c - 97] > -1) continue;
            arr[c - 97] = index;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
// 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
// 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1