package challenge2.week1;

import java.util.Scanner;

public class w1_04 {
    static int k;
    static int[] ch;
    static String[] arr;
    static String strMax = "0", strMin = "9999999999";

    static boolean validate(int beforeNum, int num, String mark) {
        boolean result = true;

        if (mark.equals("<")) {
            if (beforeNum > num) result = false;
        }
        else {
            if (beforeNum < num) result = false;
        }
        return result;
    }

    static void dfs(int l, int beforeNum, String strNum) {

        if (l == k) {
            long tmpMax = Long.valueOf(strMax);
            long tmpMin = Long.valueOf(strMin);
            long num = Long.valueOf(strNum);
            if (tmpMax < num) strMax = strNum;
            if (tmpMin > num) strMin = strNum;
        }
        else {
            for (int i = 0; i < 10; i++) {
                if (ch[i] == 0) {
                    if (validate(beforeNum, i, arr[l])) {
                        ch[i] = 1;
                        dfs(l + 1, i, strNum + i);
                        ch[i] = 0;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        sc.nextLine();
        arr = sc.nextLine().split(" ");
        ch = new int[10];
        for (int i = 0; i < 10; i++) {
            ch[i] = 1;
            String tmp = "";
            tmp += i;
            dfs(0, i, tmp);
            ch[i] = 0;
        }
        System.out.println(strMax);
        System.out.println(strMin);
    }
}
