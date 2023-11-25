package infren.section4;

import java.util.HashMap;
import java.util.Scanner;

// 아나그램이 맞는지 확인하기
public class section4_02 {
    static String solution(String t1, String t2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : t1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : t2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) return "NO";
            else map.put(x, map.get(x) - 1);
        }
//        HashMap<Character, Integer> map1 = new HashMap<>();
//        HashMap<Character, Integer> map2 = new HashMap<>();
//        for (char x : t1.toCharArray()) {
//            map1.put(x, map1.getOrDefault(x, 0) + 1);
//        }
//        for (char x : t2.toCharArray()) {
//            map2.put(x, map2.getOrDefault(x, 0) + 1);
//        }
//        for (char x : map1.keySet()) {
//            if (map1.get(x) != map2.get(x)) {
//                answer = "NO";
//                break;
//            }
//            answer = "YES";
//        }
        return answer;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t1 = sc.nextLine();
        String t2 = sc.nextLine();

        System.out.println(solution(t1, t2));
    }
}
