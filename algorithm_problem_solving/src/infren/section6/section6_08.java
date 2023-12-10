package infren.section6;

import java.util.Arrays;
import java.util.Scanner;

// 이분 검색 알고리즘
public class section6_08 {
    static int solution(int n, int k, int[] t) {
        int lt = 0, rt = n - 1;
        int m = 0;
        Arrays.sort(t);
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (t[mid] == k) {
                m = mid + 1;
                break;
            }
            // t[mid] 값이 찾으려는 값보다 크면 t[mid]값 이전으로만 찾으면 되기 때문에
            // rt 인덱스를 mid - 1을 변경해준다.
            // 작은 경우 mid 이후로 찾으면 되기 때문에 왼쪽 lt 출발 값을 mid + 1로 변경해준다.
            if (t[mid] > k) rt = mid - 1;
            else lt = mid + 1;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, t));
    }
}
