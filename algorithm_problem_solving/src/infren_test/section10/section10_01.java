package infren_test.section10;

import java.util.Scanner;

public class section10_01 {
    static int answer = 0, n;
    static int[] arr;
    static int solution(int x) {
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[x];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n + 1];
        System.out.println(solution(n));
    }
}
