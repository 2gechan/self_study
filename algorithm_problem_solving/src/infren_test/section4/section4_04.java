package infren_test.section4;

import java.util.HashMap;
import java.util.Scanner;

public class section4_04 {
    static int solution(String s, String t) {
        int answer = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char x : t.toCharArray()) map1.put(x, map1.getOrDefault(x, 0) + 1);
        int l = t.length() - 1;
        for (int i = 0; i < l; i++) map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0) + 1);
        int lt = 0;
        for (int i = l; i < s.length(); i++) {
            map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0) + 1);
            if (map1.equals(map2)) answer++;
            map2.put(s.charAt(lt), map2.get(s.charAt(lt)) - 1);
            if (map2.get(s.charAt(lt)) == 0) map2.remove(s.charAt(lt));
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
