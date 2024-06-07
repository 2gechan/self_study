package algorithm_practice01.fri;

import java.util.Scanner;
import java.util.Stack;

/*
올바른 괄호
괄호의 쌍이 맞지 않는 경우 NO를 출력 맞으면 YES
ex) (())() = 'YES', ((()) = 'NO'
 */
public class section5_01_01 {
    static String solution(String t) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : t.toCharArray()) {
            if (x == ')' && !stack.isEmpty()) stack.pop();
            else if (x == '(') stack.push(x);
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        System.out.println(solution(t));
    }
}
