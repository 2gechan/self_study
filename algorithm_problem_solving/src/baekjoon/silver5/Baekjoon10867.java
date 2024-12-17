package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Baekjoon10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
//        int[] arr = new int[1001];
        String[] line = br.readLine().split(" ");
//        for (int i = 0; i < n; i++) {
//            int num = Integer.valueOf(line[i]);
//            arr[num] = 1;
//        }
//
//        for (int i = 0; i < 1001; i++) {
//            if (arr[i] == 1) System.out.print(i + " ");
//        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.valueOf(line[i]);
            hashSet.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>(hashSet);
        Collections.sort(list);
        for (int x : list) {
            System.out.print(x + " ");
        }
    }
}
