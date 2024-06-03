package infren_test.section10;

import java.util.Scanner;

public class section10_03 {
    static int[] dy, arr;
    static int solution(int n) {
        int answer = 1;
        dy[0] = 1;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j] && dy[j] > max) max = dy[j];
            }
            dy[i] = max + 1;
            Math.max(answer, dy[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N];
        dy = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(N));
    }
}
