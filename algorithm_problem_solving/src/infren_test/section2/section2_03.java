package infren_test.section2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class section2_03 {
    static List<String> solution(int n, int[] A, int[] B) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (A[i] == B[i]) answer.add("D");
            else if(A[i] == 1 && B[i] == 3) answer.add("A");
            else if(A[i] == 3 && B[i] == 1) answer.add("B");
            else if(A[i] > B[i]) answer.add("A");
            else answer.add("B");
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        for (String x : solution(n, A, B)) System.out.println(x);
    }
}
