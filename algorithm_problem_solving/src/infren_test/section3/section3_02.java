package infren_test.section3;

import java.util.*;

public class section3_02 {
    static List<Integer> solution(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int start = 0;
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = start; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    start = j;
                    answer.add(arr1[i]);
                    break;
                }
                if (arr1[i] < arr2[j]) {
                    start = j;
                    break;
                }
            }
        }
        answer.sort(Comparator.naturalOrder());
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
