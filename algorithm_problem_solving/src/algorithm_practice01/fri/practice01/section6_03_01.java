package algorithm_practice01.fri.practice01;

import java.util.Scanner;

/*
삽입 정렬
N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
정렬하는 방법은 삽입정렬입니다.
 */
public class section6_03_01 {
    static int[] solution(int[] arr) {
        int index;
        for (int i = 1; i < arr.length; i++) {
            int num = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (num < arr[j]) arr[j + 1] = arr[j];
                else break;
            }
            // for문 마지막에 j--를 수행하고 for문이 멈추기 때문에 j - 1로 끝나게 된다
            arr[j + 1] = num;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(arr)) System.out.print(x + " ");
    }
}
