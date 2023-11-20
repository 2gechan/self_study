package baekjoon.Bronze3;

import java.util.Scanner;

public class Bronze3_1284 {
    public static void main(String[] args) {
        // 1은 2cm, 0은 4cm, 나머지 3cm
        // 각 숫자 사이 1cm
        // 호수판 경계와 숫자 사이 여백은 1cm
        Scanner scan = new Scanner(System.in);

        while (true) {
            String strTestCase = scan.nextLine();
            if (Integer.parseInt(strTestCase) == 0) {
                break;
            }
            String[] strTestCaseArr = strTestCase.split("");
            int lengthSum = 0;
            for (int i = 0; i < strTestCaseArr.length; i++) {
                int number = Integer.parseInt(strTestCaseArr[i]);
                switch (number) {
                    case 1:
                        lengthSum += 2;
                        break;
                    case 0:
                        lengthSum += 4;
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        lengthSum += 3;
                        break;
                }
            }
            System.out.println(lengthSum + 2 + (strTestCaseArr.length - 1));

        }

    }
}
