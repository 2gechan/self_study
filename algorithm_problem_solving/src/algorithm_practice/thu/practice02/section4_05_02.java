package algorithm_practice.thu.practice02;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class section4_05_02 {

    static int solution(Integer[] arr, int k) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(arr, Collections.reverseOrder());
        // TreeSet을 사용할 수도 있다.
        int cnt = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int z = j + 1; z < arr.length; z++) {
                    int sum = arr[i] + arr[j] + arr[z];
                    if (!set.contains(sum)) cnt++;
                    else set.add(sum);
                    if (cnt == k) {
                        answer = sum;
                        flag = true;
                        break;
                    }
                }
                if (flag) break;
            }
            if (flag) break;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr, k));
    }
}
