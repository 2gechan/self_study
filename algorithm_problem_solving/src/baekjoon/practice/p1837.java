package baekjoon.practice;

import java.math.BigInteger;
import java.util.Scanner;

public class p1837 {
    static String solution(String n, String k) {
        String answer = "";
        BigInteger bN = new BigInteger(n);
        BigInteger bK = new BigInteger(k);
        BigInteger i = new BigInteger("2");
        while (true) {
            if (i.compareTo(bK) == 1 || i.compareTo(bK) == 0) {
                answer = "GOOD";
                break;
            }
            if (bN.remainder(i).compareTo(BigInteger.ZERO) == 0 && i.compareTo(bK) == -1) {
                answer = "BAD " + i;
                break;
            }
            i = i.add(BigInteger.ONE);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tc = sc.nextLine().split(" ");
        String n = tc[0];
        String k = tc[1];
        System.out.println(solution(n, k));
    }
}
