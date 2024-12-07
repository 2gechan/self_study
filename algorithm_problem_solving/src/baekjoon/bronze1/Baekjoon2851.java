package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2851 {

    static int solution(int[] arr) {
        int answer = 0;

        for (int x : arr) {
            if (Math.abs(100 - answer) < Math.abs(100 - (answer + x))) break;
            answer += x;
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.valueOf(br.readLine());
        }
        System.out.println(solution(arr));
    }
}
