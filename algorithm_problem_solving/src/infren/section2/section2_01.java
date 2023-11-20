package infren.section2;

import java.util.Scanner;

public class section2_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] tc = sc.nextLine().split(" ");
        int beforeNum = 0;
        for (int i = 0; i < n; i++) {
            if (beforeNum < Integer.parseInt(tc[i])) {
                System.out.print(Integer.parseInt(tc[i]) + " ");

            }
            beforeNum = Integer.parseInt(tc[i]);
        }
    }
}
