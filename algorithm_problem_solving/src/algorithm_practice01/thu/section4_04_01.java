package algorithm_practice01.thu;

import java.util.HashMap;
import java.util.Scanner;

public class section4_04_01 {
    static int solution(String S, String T) {
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> tmp = new HashMap<>();
        for (char x : T.toCharArray()) map.put(x, map.getOrDefault(x, 0) + 1);
        int len = T.length() -1;
        for (int i = 0; i < len; i++) tmp.put(S.charAt(i), tmp.getOrDefault(S.charAt(i), 0) + 1);

        int lt = 0;
        for (int i = len; i < S.length(); i++) {
            tmp.put(S.charAt(i), tmp.getOrDefault(S.charAt(i), 0) + 1);
            if (map.equals(tmp)) answer++;
            tmp.put(S.charAt(lt), tmp.get(S.charAt(lt)) - 1);
            if (tmp.get(S.charAt(lt)) == 0) tmp.remove(S.charAt(lt));
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
