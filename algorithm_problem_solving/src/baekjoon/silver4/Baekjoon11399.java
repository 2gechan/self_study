package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon11399 {
    static int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int wait = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += wait + arr[i];
            wait += arr[i];
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[] arr = new int[n];
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(line[i]);
        }
        System.out.println(solution(arr));
    }
}
