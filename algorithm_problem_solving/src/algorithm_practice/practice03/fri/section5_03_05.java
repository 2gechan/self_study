package algorithm_practice.practice03.fri;

import java.util.Scanner;
import java.util.Stack;

public class section5_03_05 {

    static int solution(String line) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < line.length(); i++) {
            char now = line.charAt(i);

            if (now == ')') {
                if (line.charAt(i-1) == ')') {
                    stack.pop();
                    answer += 1;
                }
                else {
                    stack.pop();
                    answer += stack.size();
                }
            }
            else stack.push('(');
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(solution(line));
    }
}
