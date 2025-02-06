package algorithm_practice.practice03.thu;

import java.util.HashMap;
import java.util.Scanner;

public class section4_03_04 {

    static int solution(String s, String t) {
        int answer = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> tmp = new HashMap<>();

        for (char c : t.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        for (int i = 0; i < t.length() - 1; i++) {
            tmp.put(s.charAt(i), tmp.getOrDefault(s.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int i = t.length() - 1; i < s.length(); i++) {
            char c = s.charAt(i);
            tmp.put(c, tmp.getOrDefault(c, 0) + 1);
            if (map.equals(tmp)) answer++;

            tmp.put(s.charAt(lt), tmp.get(s.charAt(lt)) - 1);
            if (tmp.get(s.charAt(lt)) == 0) tmp.remove(s.charAt(lt));
            lt++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(solution(s, t));
    }
}
