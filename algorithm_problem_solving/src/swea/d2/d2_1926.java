package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d2_1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int gameSet = Integer.parseInt(br.readLine());
        for (int i = 1; i <= gameSet; i++) {
            String strNum = String.valueOf(i);

            if (strNum.length() > 1) {
                String[] strNumArr = strNum.split("");
                int check = 0;
                for (int j = 0; j < strNumArr.length; j++) {
                    if (strNumArr[j].equals("3") || strNumArr[j].equals("6") || strNumArr[j].equals("9")) {
                        System.out.print("-");
                        check++;
                    }
                }
                if (check > 0) {
                    System.out.print(" ");
                    continue;
                } else {
                    System.out.printf("%d ", i);
                    continue;
                }

            }
            if (i == 3 || i == 6 || i == 9) {
                System.out.print("- ");
            } else {
                System.out.printf("%d ", i);
            }

        }
    }
}
