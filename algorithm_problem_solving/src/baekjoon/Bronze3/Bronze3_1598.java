package baekjoon.Bronze3;

import java.util.Scanner;

public class Bronze3_1598 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cases = scan.nextLine().split(" ");
        int case1 = Integer.parseInt(cases[0]);
        int case2 = Integer.parseInt(cases[1]);
        int case1Y = case1 % 4 == 0 ? 4 : case1 % 4;
        int case1X = case1 / 4;
        if (case1Y != 4) {
            case1X++;
        }
        int case2Y = case2 % 4 == 0 ? 4 : case2 % 4;
        int case2X = case2 / 4;
        if (case2Y != 4) {
            case2X++;
        }
        int y = case2Y > case1Y ? case2Y - case1Y : case1Y - case2Y;
        int x = case2X > case1X ? case2X - case1X : case1X - case2X;
        System.out.println(y + x);
    }
}
