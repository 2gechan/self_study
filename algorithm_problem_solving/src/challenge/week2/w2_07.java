package challenge.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class w2_07 {

    static int lowerBound(int[] arr, int key) {
        int lo = 0, hi = arr.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if (key <= arr[mid]) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }

        }

        return lo;
    }

    static int upperBound(int[] arr, int key) {
        int lo = 0, hi = arr.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (key < arr[mid]) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }

        return lo;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            int key = Integer.valueOf(st.nextToken());
            nArr[i] = key;
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int m = Integer.valueOf(br.readLine());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");

        String answer = "";
        for (int i = 0; i < m; i++) {
            int key = Integer.valueOf(st.nextToken());
            sb.append(map.getOrDefault(key, 0)).append(" ");
            int count = upperBound(nArr, key) - lowerBound(nArr, key);
            answer += count + " ";
        }
        System.out.println(sb);


    }
}
