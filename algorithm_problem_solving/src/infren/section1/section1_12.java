package infren.section1;

import java.util.Scanner;

public class section1_12 {

    static String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            // tmp가 2진수 이니까 10진수로 바꿔라라는 의미
            int num = Integer.parseInt(tmp, 2);
            // 정수형을 (char)로 형변환 해주면 문자로 바뀐다.
            // ex) num이 67 이면 알파벳 C를 의미
            answer += (char) num;
            // 7번 인덱스부터 끝까지 다시 만든다.
            s = s.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        String answer = solution(str, len);
        System.out.println(answer);

//        String[] secret = new String[len];
//        String[] tc = sc.nextLine().split("");
//        int index = 0;
//        String tmp = "";
//        for (int i = 0; i < tc.length; i++) {
//            tmp += tc[i];
//            if (tmp.length() > 6) {
//                secret[index] = tmp;
//                tmp = "";
//                index++;
//            }
//        }
//
//        int[] arr = {64, 32, 16, 8, 4, 2, 1};
//        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
//                'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
//                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
//        String result = "";
//        for (int i = 0; i < len; i++) {
//            int change10 = 0;
//            for (int j = 0; j < 7; j++) {
//                if (secret[i].charAt(j) == '#') {
//                    change10 += arr[j];
//                }
//            }
//            char a = alphabet[change10 - 65];
//            result += a;
//        }
//        System.out.println(result);
    }
}
