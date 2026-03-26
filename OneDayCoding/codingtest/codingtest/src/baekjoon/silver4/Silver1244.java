package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver1244 {

    static int n;
    static int[] arr;

    static void solution(int sex, int num) {

        if (sex == 1) {

            for (int i = num; i <= n; i += num) {
                arr[i - 1] = arr[i - 1] == 0 ? 1 : 0;
            }

        }
        else {

            num -= 1;
            arr[num] = arr[num] == 0 ? 1 : 0;

            int lt = num - 1;
            int rt = num + 1;
            while (true) {
                if (lt < 0 || rt >= n) break;

                if (arr[lt] == arr[rt]) {
                    arr[lt] = arr[lt] == 0 ? 1 : 0;
                    arr[rt] = arr[rt] == 0 ? 1 : 0;
                }
                else break;

                lt--;
                rt++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            solution(sex, num);
            // for (int j = 0; j < n; j++) System.out.print(arr[j] + " ");
        }

        for (int i = 0; i < n; i++) {
            if (i > 0 && i % 20 == 0) System.out.println();
            System.out.print(arr[i] + " ");
        }
    }
}
/*
0 1 0 1 0 0 0 1
0 1 1 1 0 1 0 1 -> 0 1 1 1 0 1 0 1
1 0 0 0 1 1 0 1
 */