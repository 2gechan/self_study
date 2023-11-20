package infren.section2;

import java.util.Scanner;

public class section2_04 {
    static int[] arr;
    static void solution(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0) arr[i] = 1;
            else if (i == 1) arr[i] = 1;
            else arr[i] = arr[i - 2] + arr[i - 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        arr = new int[n];
        solution(n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
