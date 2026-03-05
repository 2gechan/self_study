package baekjoon.bronze2;

import java.util.Scanner;

public class Bronze2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String line = sc.nextLine();
            int n = Integer.parseInt(line.split(" ")[0]);
            String word = line.split(" ")[1];
            for (char c : word.toCharArray()) {
                for (int i = 0; i < n; i++) sb.append(c);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
