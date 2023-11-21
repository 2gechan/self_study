package infren.section2;

import java.util.Scanner;

public class section7_09 {
    static int solution(int[][] t) {
        int sum1, sum2;
        int max = 0;
        for (int i = 0; i < t.length; i++) {
            sum1=sum2=0;
            for (int j = 0; j < t.length; j++) {
                sum1 += t[i][j];
                sum2 += t[j][i];
            }
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
        }
        sum1=sum2=0;
        for (int i = 0; i < t.length; i++) {
            sum1 += t[i][i];
            sum2 += t[i][t.length - i -1];
        }
        max = Math.max(max, sum1);
        max = Math.max(max, sum2);
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] t = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] tc = sc.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                t[i][j] = Integer.parseInt(tc[j]);
            }
        }
        System.out.println(solution(t));
    }
}
