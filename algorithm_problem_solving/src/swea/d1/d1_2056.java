package swea.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d1_2056 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(br.readLine());
        String[] resultArr = new String[testCaseCount];
        for (int i = 0; i < testCaseCount; i++) {
            String testCase = br.readLine();
            String year = testCase.substring(0, 4);
            int month = Integer.parseInt(testCase.substring(4, 6));
            int day = Integer.parseInt(testCase.substring(6));
            if (month > 12 || month < 1 || day < 1) {
                resultArr[i] = "-1";
                continue;
            }
            switch (month) {
                case 2:
                    if (day > 28) {
                        resultArr[i] = "-1";
                        continue;
                    }
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day > 31) {
                        resultArr[i] = "-1";
                        continue;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day > 30) {
                        resultArr[i] = "-1";
                        continue;
                    }

            }
            String strMonth = month < 10 ? "0" + month : "" + month;
            String strDay = day < 10 ? "0" + day : "" + day;
            resultArr[i] = year + "/" + strMonth + "/" + strDay;
        }
        for (int i = 0; i<resultArr.length; i++) {
            System.out.printf("#%d %s\n", i + 1, resultArr[i]);
        }
    }
}
