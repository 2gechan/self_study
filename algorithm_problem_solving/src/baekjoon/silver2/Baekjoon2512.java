package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;

public class Baekjoon2512 {

    static int[] arr;
    static boolean chk(int mid, int M) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.min(arr[i], mid); // 상한선보다 적은 예산을 요청한 지방은 요청한 예산 배정
        }

        return sum <= M;
    }

    static int solution(int M) {

        int min = 0;
        int max = Arrays.stream(arr).max().getAsInt();

        while (min <= max) {
            int mid = (min + max) / 2;

            if (chk(mid, M)) {
                min = mid + 1; // 예산이 충분하다면 최대 상한선의 예산을 배정해주기 위해 최소값 상승
            }
            else {
                max = mid - 1;
            }

        }

        return max;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }
        int M = Integer.valueOf(br.readLine());
        System.out.println(solution(M));
    }
}
