package algorithm_practice01.fri;

import java.util.Scanner;

/*
선택 정렬
N개의 숫자를 선택정렬 방식으로 오름차순 정렬
주어진 배열에서 가장 최솟값을 먼저 찾은 후 맨 처음 위치와 교체
맨 처음을 뺀 나머지를 같은 방식으로 정렬
 */
public class section6_01_01 {
    static int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i, min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
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
