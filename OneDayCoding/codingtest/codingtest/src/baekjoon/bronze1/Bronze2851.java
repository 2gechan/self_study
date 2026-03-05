package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze2851 {

    static int[] arr;

    static int result = 0;
    static boolean flag = false;
    static void dfs() {
        if (flag) return;
        for (int i = 0; i < arr.length; i++) {

            if (Math.abs(100 - result) == Math.abs(100 - (result + arr[i]))) {
                result += arr[i];
            } else if (Math.abs(100 - result) > Math.abs(100 - (result + arr[i]))) {
                result += arr[i];
            } else if (Math.abs(100 - result) < Math.abs(100 - (result + arr[i]))) {
                flag = true;
                return;
            }
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.valueOf(br.readLine());
        }
        dfs();
        System.out.println(result);
    }
}
