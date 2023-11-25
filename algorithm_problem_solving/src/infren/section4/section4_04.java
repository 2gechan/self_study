package infren.section4;

import java.util.HashMap;
import java.util.Scanner;

// s 문자열에 들어있는 t 문자열 아나그램 패턴 개수 구하기
public class section4_04 {
    static int solution(String s, String t) {
        HashMap<Character, Integer> tmap = new HashMap<>();
        HashMap<Character, Integer> smap = new HashMap<>();
        int count = 0;
        for (char x : t.toCharArray()) {
            tmap.put(x, tmap.getOrDefault(x, 0) + 1);

        }
        int l = tmap.size() - 1;
        for (int i = 0; i < l; i++) {
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int i = l; i < s.length(); i++) {
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
            if (tmap.equals(smap)) count++;
            smap.put(s.charAt(lt), smap.get(s.charAt(lt)) - 1);
            if (smap.get(s.charAt(lt)) == 0) smap.remove(s.charAt(lt));
            lt++;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(solution(s, t));
    }
}
