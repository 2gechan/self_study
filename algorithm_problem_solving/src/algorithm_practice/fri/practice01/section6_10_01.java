package algorithm_practice.fri.practice01;

import java.util.Arrays;
import java.util.Scanner;

/*
마구간 정하기(결정알고리즘)
N개의 마구간이 수직선상에 있습니다.
각 마구간은 x1, x2, x3, ......, xN의 좌표를 가지며, 마 구간간에 좌표가 중복되는 일은 없습니다.
현수는 C마리의 말을 가지고 있는데, 이 말들은 서로 가까이 있는 것을 좋아하지 않습니다.
각 마구간에는 한 마리의 말만 넣을 수 있고, 가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치하고 싶습니다.
C마리의 말을 N개의 마구간에 배치했을 때 가장 가까운 두 말의 거리가 최대가 되는 그 최대 값을 출력하는 프로그램을 작성하세요.
 */
public class section6_10_01 {

    static int count(int distance, int[] arr) {
        int cnt = 1;
        int before = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - before >= distance) {
                cnt++;

                before = arr[i];
            }
        }
        return cnt;
    }

    static int solution(int c, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[arr.length - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(mid, arr) >= c) {
                answer = mid;

                lt = mid + 1;
            } else rt = mid - 1;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(c, arr));
    }
}
