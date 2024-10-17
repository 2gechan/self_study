package challenge2.week2;

import java.util.Arrays;
import java.util.Scanner;

// 반례를 못찾겠음
public class w2_04 {
    static int[] solution(int n, int[] arr) {
        int[][] tmp = new int[n][3];
        int tmpIndex = 0;
        int arrIndex = 0;
        int in = 0; // 들어온 시점

        // 사진 3개 게시
        while (tmpIndex < n && arrIndex < arr.length) {
            int num = arr[arrIndex++];
            boolean flag = true;

            // 이미 등록되어 있는 후보인지 체크
            for (int i = 0; i < n; i++) {
                if (tmp[i][0] == num) {
                    tmp[i][1]++;
                    flag = false;
                    break;
                }
            }
            // 처음 게시되는 후보인 경우
            if (flag) {
                tmp[tmpIndex][0] = num;
                tmp[tmpIndex][2] = in++;
                tmpIndex++;
            }
        }

        for (; arrIndex < arr.length; arrIndex++) {
            int num = arr[arrIndex];
            boolean flag = true;
            // 등록되어 있는 회원 체크
            for (int i = 0; i < n; i++) {
                if (tmp[i][0] == num) {
                    tmp[i][1]++;
                    flag = false;
                    break;
                }
            }

            // 등록되어 있지 않은 회원이며, 사진을 게시할 자리가 없는 경우
            if (flag) {
                int value = Integer.MAX_VALUE; // 추천 받은 횟수 비교
                int inTime = Integer.MAX_VALUE; // 들어온 시점 비교
                int index = 0; // 사진에서 빠질 학생 index

                for (int i = 0; i < n; i++) {

                    // 추천 횟수가 같은 경우,
                    if (tmp[i][1] == value) {
                        // 사진 게시가 오래된 학생이 빠진다.
                        if (tmp[i][2] < inTime) {
                           value = tmp[i][1];
                           inTime = tmp[i][2];
                           index = i;
                        }
                    }
                    // 추천 횟수가 가장 적은 경우
                    else if (tmp[i][1] < value) {
                        value = tmp[i][1];
                        inTime = tmp[i][2];
                        index = i;
                    }
                }
                tmp[index][0] = num;
                tmp[index][2] = in++;
            }
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = tmp[i][0];
        }

        // 학생 번호 오름차순 정렬
        Arrays.sort(result);

        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
