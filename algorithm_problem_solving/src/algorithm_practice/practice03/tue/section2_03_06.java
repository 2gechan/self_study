package algorithm_practice.practice03.tue;

import java.util.Scanner;

public class section2_03_06 {

    static String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);

            String tmp = sb.reverse().toString();
            int reverse = Integer.valueOf(tmp);
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(reverse); j++) {
                if (reverse % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag && reverse > 1) answer.append(reverse + " ");
        }

        return answer.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];

        String[] line = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = line[i];
        }
        System.out.println(solution(arr));


    }
}
