package algorithm_practice.wed.practice01;

import java.util.*;

/*
공통원소 구하기

 */
public class section3_02_01 {
    static List<Integer> solution(int[] arr1, int[] arr2) {
        int lt1 = 0, lt2 = 0;
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while (lt1 < arr1.length && lt2 < arr2.length) {
            System.out.println("비교 대상 : " + arr1[lt1] + ", " + arr2[lt2]);
            if (arr1[lt1] == arr2[lt2]) {
                answer.add(arr1[lt1]);
                lt1++; lt2++;
            }
            else if (arr1[lt1] > arr2[lt2]) lt2++;
            else lt1++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int x : solution(arr1, arr2)) System.out.print(x + " ");
    }
}
