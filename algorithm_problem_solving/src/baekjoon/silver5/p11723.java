package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11723 {
    static boolean[] list = new boolean[21];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.valueOf(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String input = st.nextToken();
            int x;
            switch (input) {
                case "add" :
                    x = Integer.parseInt(st.nextToken());
                    list[x] = true;
                    break;
                case "check":
                    x = Integer.parseInt(st.nextToken());
                    sb.append(list[x] ? 1 : 0).append("\n");
                    break;
                case "remove":
                    x = Integer.parseInt(st.nextToken());
                    list[x] = false;
                    break;
                case "toggle":
                    x = Integer.parseInt(st.nextToken());
                    if (list[x]) list[x] = false;
                    else list[x] = true;
                    break;
                case "all":
                    for (int j = 1; j <= 20; j++) {
                        list[j] = true;
                    }
                    break;
                case "empty":
                    for (int j = 1; j <= 20; j++) {
                        list[j] = false;
                    }
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
