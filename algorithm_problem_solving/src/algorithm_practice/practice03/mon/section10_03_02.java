package algorithm_practice.practice03.mon;

import java.util.Scanner;

public class section10_03_02 {

    static int solution(int n) {

        int[] arr = new int[n + 2];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n + 1; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n + 1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}
