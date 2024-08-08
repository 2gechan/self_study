package algorithm_practice.tue.practice01;

import java.util.Scanner;

/*
보이는 학생
N명의 학생들이 일렬로 서있을 때
맨앞에서 볼 수 있는 학생의 수 구하기
어떤 학생이 자 앞에 서있는 학생보다 크다면 보이고
작거나 같으면 보이지 않는다.
 */
public class section2_02_01 {
    static int solution(int[] arr) {
        int answer = 0;
        int maxHeight = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxHeight) {
                answer++;
                maxHeight = arr[i];
            }
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
        System.out.println(solution(arr));
    }
}
