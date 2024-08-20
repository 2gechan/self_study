package challenge.week3;

import java.util.Scanner;

public class w3_02 {

    static long upperBound(int[] arr, long max, int n) {
        long lo = 0;
        // 가장 긴 랜선의 길이가 1일 경우 (lo + hi) / 2를 하게 되면 0이 나오기 때문에 max 값을 +1 해준다.
        long hi = max + 1;

        long mid = 0;

        while (lo < hi) {
            int count = 0; // 몇 개의 랜선으로 나뉘어지는지 카운팅
            mid = (lo + hi) / 2;

            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / mid); // mid 길이로 잘랐을 때 각 선들이 몇개로 나뉘어 지는지?
            }

            // n개의 랜선 개수 만큼 안나왔을 경우 기준 길이를 더 짧게
            if (count < n) {
                hi = mid;
            }
            // n 개 이상으로 나뉘어졌을 경우 최대 길이를 구해야하기 때문에 기준값 + 1을 해준다.
            else {
                lo = mid + 1;
            }
        }

        // upperBound는 최대 조건이 될 수 있는 값 + 1이기 때문에 return 시 -1을 해준 값이 최대 길이
        return lo - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[k];
        long max = 0;
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) max = arr[i];
        }
        System.out.println(upperBound(arr, max, n));
    }
}
