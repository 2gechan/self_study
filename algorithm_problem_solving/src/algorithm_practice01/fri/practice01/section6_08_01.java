package algorithm_practice01.fri.practice01;

import java.util.Arrays;
import java.util.Scanner;

/*
이분검색
임의의 N개의 숫자가 입력으로 주어집니다.
N개의 수를 오름차순으로 정렬한 다음
N개의 수 중 한 개의 수인 M이 주어지면 이분검색으로
M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.

이분검색 : 배열 length / 2 의 index에 존재하는 값이 찾으려는 값보다 크다면 그 뒤쪽은 검색할 필요 없음 작다면 뒤쪽만 검색
        배열의 절반씩 나눠가며 검색
 */
public class section6_08_01 {
    static int solution(int[] arr, int m) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = arr.length - 1;
        while (lt <= rt) {
            int index = (lt + rt) / 2;
            if (arr[index] == m) {
                answer = index + 1;
                break;
            }
            else if (arr[index] > m) rt = index;
            else lt = index;
        }


        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr, m));
    }
}
