package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver10610 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strNum = br.readLine();

        int[] arr = new int[10];
        int sum = 0;

        for (char c : strNum.toCharArray()) {
            int num = c - '0';
            arr[num]++;
            sum += num;
        }

        StringBuilder sb = new StringBuilder();
        if (!strNum.contains("0") || sum % 3 != 0) {
            sb.append("-1");
        }
        else {
            for (int i = arr.length - 1; i >= 0; i--) {
                while (arr[i] > 0) {
                    sb.append(i);
                    arr[i]--;
                }
            }
        }
        System.out.println(sb.toString());



    }
}
