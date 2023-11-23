package infren.section3;

import java.util.Scanner;

public class section3_04 {
    //    static int solution(int n, int m, int[] t) {
//        int max = 0, count = 0;
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for (int j = i; j < n; j++) {
//                sum += t[j];
//                if (sum > m) break;
//                else if(sum == m) {
//                    count++;
//                    break;
//                }
//            }
//        }
//        return count;
//    }
    static int solution(int n, int m, int[] t) {
        int lt = 0, sum = 0, count = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += t[rt];
            if (sum == m) count++;
            while (sum >= m) {
                sum -= t[lt++];
                if (sum == m) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
         System.out.println(solution(n, m, t));
    }
}
