package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver11723 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        boolean[] result = new boolean[21];
        StringBuilder sb = new StringBuilder();
        while (m-- > 0) {

            String[] arr = br.readLine().split(" ");

            switch (arr[0]) {
                case "add":
                    result[Integer.parseInt(arr[1])] = true;
                    break;
                case "remove":
                    result[Integer.parseInt(arr[1])] = false;
                    break;
                case "check":
                    if (result[Integer.parseInt(arr[1])]) sb.append("1");
                    else sb.append("0");
                    sb.append("\n");
                    break;
                case "toggle":
                    result[Integer.parseInt(arr[1])] = !result[Integer.parseInt(arr[1])];
                    break;
                case "all":
                    Arrays.fill(result, true);
                        break;
                case "empty":
                    Arrays.fill(result, false);
                    break;
            }

        }
        System.out.println(sb.toString());
    }
}
