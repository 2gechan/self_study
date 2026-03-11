package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver1920 {

    static boolean binarySearch(int[] arr, int num) {
        boolean result = false;

        int lt = 0, rt = arr.length - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (arr[mid] == num) {
                result = true;
                break;
            }
            else if (arr[mid] > num) {
                rt = mid - 1;
            }
            else {
                lt = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            boolean result = binarySearch(arr, Integer.parseInt(st.nextToken()));
            sb.append(result ? 1 : 0).append("\n");
        }
        System.out.println(sb.toString());
    }
}
