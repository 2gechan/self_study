package infren_test.section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class section5_07 {
    static String solution2(String a, String b) {
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();
        for (char x : a.toCharArray()) q.offer(x);
        for (char x : b.toCharArray()) {
            if (q.contains(x)) {
                if (x != q.poll()) return "NO";
            }
        }
        if (!q.isEmpty()) return "NO";
        return answer;
    }
    static String solution(String a, String b) {
        String answer = "YES";
        for (int i = 0; i < a.length(); i++) {
            int index = b.indexOf(a.charAt(i));
            if (index < 0) return "NO";
            for (int j = i + 1; j < a.length(); j++) {
                if (index > b.indexOf(a.charAt(j))) return "NO";
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(solution(a, b));
    }
}
