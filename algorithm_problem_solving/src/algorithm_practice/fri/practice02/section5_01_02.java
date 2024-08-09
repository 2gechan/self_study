package algorithm_practice.fri.practice02;

import java.util.Scanner;
import java.util.Stack;

public class section5_01_02 {

    static String solution(String testCase) {
        String answer = "";
        Stack<Character> stack = new Stack();
        for (char x : testCase.toCharArray()) {
            if (x == '(') stack.push('(');
            else if (x == ')' && !stack.isEmpty()) stack.pop();
        }

        answer = stack.isEmpty() ? "YES" : "NO";
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String testCase = sc.nextLine();
        System.out.println(solution(testCase));
    }
}
