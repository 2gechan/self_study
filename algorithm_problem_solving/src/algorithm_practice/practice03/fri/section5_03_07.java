package algorithm_practice.practice03.fri;

import java.util.Scanner;
import java.util.Stack;

public class section5_03_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = str1.length() - 1; i >= 0; i--) {
            stack.push(str1.charAt(i));
        }
        for (char c : str2.toCharArray()) {
            if (!stack.isEmpty() && c == stack.peek()) stack.pop();
        }
        if (stack.isEmpty()) System.out.println("YES");
        else System.out.println("NO");
    }
}
