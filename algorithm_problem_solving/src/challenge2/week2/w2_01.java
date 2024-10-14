package challenge2.week2;

import java.util.Arrays;
import java.util.Scanner;

public class w2_01 {
    static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int[] tmp = new int[n - 1];
        int index = 0;
        for (int i = 1; i < n; i++) {
            tmp[index] = arr[i] - arr[i - 1];
            index++;
        }
        Arrays.sort(tmp);

        int limit = (n - 1) - (k - 1);
        for (int i = 0; i < limit; i++) {
            answer += tmp[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 원생의 수
        int k = sc.nextInt(); // 나눠야하는 조의 수
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }
}
