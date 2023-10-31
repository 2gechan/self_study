package Bronze3;

import java.util.Scanner;

public class Bronze3_1547 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCaseNumber = Integer.parseInt(scan.nextLine());
        int ballLocation = 1;
        for (int i = 0; i < testCaseNumber; i++) {
            String[] cases = scan.nextLine().split(" ");
            int case1 = Integer.parseInt(cases[0]);
            int case2 = Integer.parseInt(cases[1]);
            if (ballLocation == case1) {
                ballLocation = case2;
            } else if (ballLocation == case2) {
                ballLocation = case1;
            }
        }
        System.out.println(ballLocation);
    }
}
