package algorithm_practice01.thu;

import java.util.*;

/*
매출액의 종류
N일 동안의 매출 기에서 연속된 K일 동안 매출액의 종류 구하기
ex) N=7, K=4, 20 12 20 10 23 17 10
[20, 12, 20, 10] = 3
[12, 20, 10, 23] = 4
[20, 10, 23, 17] = 4
[10, 23, 17, 10] = 3
N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별 매출액의 종 류를 출력
 */
public class section4_03_01 {
    static String solution(int n, int k, int[] arr) {
        int x = 0;
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= n - k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        sb.append(map.size() + " ");
        for (int i = n - k + 1; i < n; i++) {
            int tmp = map.get(arr[x]);
            if (tmp == 1) map.remove(arr[x]);
            else map.put(arr[x], map.get(arr[x]) - 1);
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            x++;
            sb.append(map.size() + " ");
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }
}
