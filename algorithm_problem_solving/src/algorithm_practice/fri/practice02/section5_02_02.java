package algorithm_practice.fri.practice02;

import java.util.Scanner;
import java.util.Stack;

public class section5_02_02 {
    static String solution(String word) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) {
            if (c == '(') stack.push(c);
            else if (c == ')') stack.pop();
            else {
                if (stack.isEmpty()) answer += c;
            }

        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(solution(word));
    }
}
