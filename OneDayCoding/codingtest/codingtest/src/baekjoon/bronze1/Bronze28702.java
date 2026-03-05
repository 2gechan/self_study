package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze28702 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;
        int index = 0;
        for (int i = 1; i <= 3; i++) {
            String line = br.readLine();
            if (Character.isDigit(line.charAt(0))) {
                num = Integer.valueOf(line);
                index = i;
                break;
            }
        }

        int lastNum = num;
        for (int i = index + 1; i <= 4; i++) {
            lastNum += 1;
        }
        if (lastNum % 15 == 0) System.out.println("FizzBuzz");
        else if (lastNum % 3 == 0) System.out.println("Fizz");
        else if (lastNum % 5 == 0) System.out.println("Buzz");
        else System.out.println(lastNum);
    }
}
