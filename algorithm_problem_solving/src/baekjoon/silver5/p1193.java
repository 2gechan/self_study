package baekjoon.silver5;

import java.util.Scanner;

public class p1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int block_sum = 0, level = 1;
        while (true) {
            if (n <= level + block_sum) {
                if (level % 2 == 0) {
                    System.out.println(n - block_sum + "/" + (level - (n - block_sum - 1)));
                }
                else {
                    System.out.println((level - (n - block_sum - 1)) + "/" + (n-block_sum));
                }
            }
            else {
                block_sum += level;
                level++;
            }
        }
    }
}
