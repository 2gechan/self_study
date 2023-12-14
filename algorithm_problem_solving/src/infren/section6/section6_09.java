package infren.section6;

import java.util.Arrays;
import java.util.Scanner;

// 결정 알고리즘
// 이분 검색과 같지만 조건에 가장 근접한 값을 찾는다.
public class section6_09 {
    static int count(int[] arr, int capacity) {
        // cnt 는 디스크 숫자를 나타낸다.
        int cnt = 1, sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                // sum에 값들을 누적시키다가 capacity 값 보다 클 경우
                // 더했을 때 큰 값부터 다시 새로운 디스크에 담는 표현
                sum = x;
            } else sum += x;
        }
        return cnt;
    }

    static int solution(int n, int m, int[] arr) {
        int answer = 0;
        // 현재 코드에서 stream을 사용하게 되면 굳이 for문을 사용하지 않아도 된다.
        // stream에서 max는 Optional int 를 반환하기 때문에 getAsInt를 실행해 주어야한다.
        int lt = Arrays.stream(arr).max().getAsInt();
        // sum은 결과에 대한 타입을 그대로 반환해주기 때문에 getAsInt가 필요없다.
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(solution(n, m, arr));
    }
}
