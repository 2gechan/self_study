package Bronze3;

import java.util.Scanner;

public class Bronze3_1267 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 영식 요금제 Y 1 ~ 29초마다 10원
        // 민식 요금제 M 1 ~ 59초마다 15원

        // 저번달 이용한 통화 개수 N개 입력
        int testCase = Integer.parseInt(scan.nextLine());

        String[] strCallTimeArr = scan.nextLine().split(" ");
        int[] callTimeArr = new int[testCase];
        for (int i = 0; i < strCallTimeArr.length; i++) {
            callTimeArr[i] = Integer.parseInt(strCallTimeArr[i]);
        }
        int Y = 0;
        int M = 0;
        // N개 통화의 각각의 통화 시간의 합
        for (int i = 0; i < testCase; i++) {
            int intTimeY = callTimeArr[i] / 30;
            double dblTimeY = callTimeArr[i] % 30;
            Y += dblTimeY >= 0 ? intTimeY + 1 : intTimeY;

            int intTimeM = callTimeArr[i] / 60;
            double dblTimeM = callTimeArr[i] % 60;
            M += dblTimeM >= 0 ? intTimeM + 1 : intTimeM;

        }

        int yCost = Y * 10;
        int mCost = M * 15;
        if (yCost > mCost) {
            System.out.println("M " + mCost);
        } else if (yCost < mCost) {
            System.out.println("Y " + yCost);
        } else {
            System.out.println("Y M " + yCost);
        }

    }
}
