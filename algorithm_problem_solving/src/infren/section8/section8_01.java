package infren.section8;

import java.util.Scanner;

// dfs를 이용한 한개의 집합에서 합이 같은 두개의 부분집합 유무 파악하기
public class section8_01 {
    static int n;
    static int total;
    static String answer = "NO";
    static int[] arr;
    static boolean flag = false;
    // 결과가 한번만 맞으면 되기 때문에 그 뒤의 재귀함수는 모두 바로 종료하기 위해 사용

    static void dfs(int x, int sum) {
        if (flag) return;
        if (sum > total / 2) return;
        if (x == n) {
            if (total - sum == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            dfs(x + 1, sum + arr[x]); // x번째 index를 사용할 때
            dfs(x + 1, sum); // x번째 index를 사용하지 않을 때
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
            total += num;
        }
        dfs(0, 0);
        System.out.println(answer);
    }
}
