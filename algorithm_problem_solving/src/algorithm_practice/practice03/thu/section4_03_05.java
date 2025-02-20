package algorithm_practice.practice03.thu;

import javax.naming.spi.DirObjectFactory;
import java.util.*;

public class section4_03_05 {

    static int solution(int[] arr, int k) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int l = j + 1; l < arr.length; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int x : set) {
            cnt++;
            if (cnt == k) {
                answer = x;
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr, k));
    }
}
