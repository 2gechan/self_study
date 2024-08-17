package challenge.week2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class w2_06 {

    static int[] solution(int n, int[] nArr, int m, int[] mArr) {

        int[] answer = new int[m];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nArr[i], map.getOrDefault(nArr[i], 0) + 1);
        }
        for (int i = 0; i < m; i++) {
            if (map.containsKey(mArr[i])) answer[i] = 1;
        }

        return answer;

    }

    static void solution(int n, int[] nArr, int[] mArr) {
        Arrays.sort(nArr);

        for (int x : mArr) {
            int lt = 0, rt = n - 1;
            boolean flag = false;
            while (lt <= rt) {
                int mid = (lt + rt) / 2;
                if (nArr[mid] == x) {
                    flag = true;
                    break;
                }
                else if (nArr[mid] > x) rt = mid - 1;
                else lt = mid + 1;
            }
            if (flag) System.out.println(1);
            else System.out.println(0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < m; i++) {
            mArr[i] = sc.nextInt();
        }
        // for (int x : solution(n, nArr, m, mArr)) System.out.println(x);
        solution(n, nArr, mArr);
    }
}
