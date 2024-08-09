package challenge.week1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class w1_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder()); // default 오름차순 정렬
        System.out.println(arr[k - 1]); // 0 번 인덱스부터 시작하기 때문에 k - 1 인덱스를 찾는다.
    }
}
