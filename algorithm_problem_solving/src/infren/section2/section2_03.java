package infren.section2;

import java.util.Scanner;

public class section2_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] A = sc.nextLine().split(" ");
        String[] B = sc.nextLine().split(" ");
        // 1: 가위, 2: 바위, 3: 보
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(A[i]);
            int b = Integer.parseInt(B[i]);
            if (a == 3 && b == 1) System.out.println("B");
            else if (a == 1 && b == 3) System.out.println("A");
            else if (a - b > 0) System.out.println("A");
            else if (a - b < 0) System.out.println("B");
            else System.out.println("D");
        }
    }
}
