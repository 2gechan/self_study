package baekjoon.bronze2;

import java.util.HashSet;
import java.util.Scanner;

public class Bronze3052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            hashSet.add(n % 42);
        }
        System.out.println(hashSet.size());
    }
}
