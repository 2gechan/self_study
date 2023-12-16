package infren.section7;

import java.util.Scanner;

// 재귀 함수를 이용한 피보나치 수
public class section7_04 {
    static int[] fibo;
    static int dfs(int n) {
        // 메모리제이션을 이용해서 시간복잡도를 줄일 수 있다.
        // 이미 구한 값을 한번더 구할 필요가 없다.
        if (fibo[n] > 0) return fibo[n];
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        // 앞전 수와 앞앞전 수 를 더해서 다음 값을 구하는 방식
        else return fibo[n] = dfs(n - 2) + dfs(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo = new int[n + 1];
        dfs(n);
        for (int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
    }
}
