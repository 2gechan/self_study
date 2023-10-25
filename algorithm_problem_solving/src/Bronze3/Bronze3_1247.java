package Bronze3;

import java.math.BigInteger;
import java.util.Scanner;

public class Bronze3_1247 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int caseCount = scan.nextInt();
            BigInteger result = new BigInteger("0");
            for (int j = 0; j < caseCount; j++) {
                result = result.add(scan.nextBigInteger());
            }
            if (result.compareTo(BigInteger.ZERO) == 1) {
                System.out.println("+");
            } else if (result.compareTo(BigInteger.ZERO) == -1) {
                System.out.println("-");
            } else {
                System.out.println("0");
            }
        }
    }
}
