package algorithm_practice.practice03.mon;

import java.util.Scanner;

public class section1_03_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        while (N-- > 0) {
            String word = sc.nextLine();
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            System.out.println(sb.toString());
        }
    }
}
