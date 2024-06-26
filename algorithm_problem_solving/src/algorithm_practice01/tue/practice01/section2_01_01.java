package algorithm_practice01.tue.practice01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
숫자 찾기
자신의 앞 수보다 크면 출력
 */
public class section2_01_01 {
    static List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int prevNum = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > prevNum) {
                answer.add(x);
            }
            prevNum = x;
        }
        return answer;
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
