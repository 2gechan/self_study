package algorithm_practice.thu.practice02;

import java.util.HashMap;
import java.util.Scanner;

public class section4_04_02 {

    static int solution(String S, String T) {
        int answer = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> tmp = new HashMap<>();
        for (char c : T.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);


        for (int i = 0; i < T.length() - 1; i++) {
            char c = S.charAt(i);
            tmp.put(c, tmp.getOrDefault(c, 0) + 1);
        }

        int lt = 0;
        for (int i = T.length() - 1; i < S.length(); i++) {
            char c = S.charAt(i);
            tmp.put(c, tmp.getOrDefault(c, 0) + 1);
            if (map.equals(tmp)) answer++;

            char removeChar = S.charAt(lt);
            if (tmp.get(removeChar) == 1) tmp.remove(removeChar);
            else tmp.put(removeChar, tmp.get(removeChar) - 1);

            lt++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        System.out.println(solution(S, T));
    }
}
