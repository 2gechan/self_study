package algorithm_practice.practice03.fri;

import java.util.Scanner;
import java.util.Stack;

public class section5_03_01 {
    static String solution(String line) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char c : line.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (stack.size() > 0) stack.pop();
                else {
                    answer = "NO";
                }
            }
        }
        if (stack.size() > 0) answer = "NO";

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(solution(line));
    }
}
