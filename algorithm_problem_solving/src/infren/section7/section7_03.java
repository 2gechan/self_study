package infren.section7;

import java.util.Scanner;

// 재귀함수를 이용해 팩토리얼 구하기
public class section7_03 {
    static int sum = 1;
    static void dfs(int n) {
        if (n == 0) return;
        else {
            sum *= n;
            dfs(n-1);
        }
        /*
        if (n == 1) return 1;
        else return n * dfs(n-1);
         */
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dfs(n);
        System.out.println(sum);
    }
}
