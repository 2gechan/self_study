package infren.section2;

import java.util.Scanner;

public class section2_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] tc = sc.nextLine().split(" ");
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (max < Integer.parseInt(tc[i])) {
                count++;
                max = Integer.parseInt(tc[i]);
            }
        }
        System.out.println(count);
    }
}
