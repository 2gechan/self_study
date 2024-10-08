package challenge2.week1;

import java.util.Scanner;

public class w1_02 {
    static int n, s, answer = 0;
    static int[] arr;
    static void solution(int index, int sum) {
        if (index == n) {
            if (sum == s) answer++;
        }
        else {
            // 배열의 index 번째 정수를 포함시키는 경우
            solution(index + 1, sum + arr[index]);
            // 배열의 index 번째 정수를 포함시키지 않는 경우
            solution(index + 1, sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(0, 0);
        if (answer > 0 && s == 0) answer = answer - 1;
        System.out.println(answer);
    }
}
