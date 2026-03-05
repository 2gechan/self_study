package baekjoon.bronze1;

import java.util.Scanner;

public class Bronze1110 {

    static int cnt = 0;
    static void solution(int base, int n) {

        String strNum = "" + n;
        if (n < 10) {
            strNum = "0" + strNum;
        }
        String tmp1 = strNum.substring(0, 1);

        String tmp2 = strNum.substring(strNum.length() - 1, strNum.length());

        int sum = Integer.valueOf(tmp1) + Integer.valueOf(tmp2);
        String result = "" + (n % 10) + (sum % 10);


        if (Integer.valueOf(result) == base) {
            cnt++;
            return;
        }
        cnt++;
        solution(base, Integer.valueOf(result));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n, n);
        System.out.println(cnt);
    }
}
