package infren_test.section1;

import java.util.*;

public class section1_11 {
    static String solution(String s) {
        String answer="";
        s=s+" "; // 마지막 문자 체크를 위해 공백 추가
        int cnt=1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)) cnt++;
            else{
                answer+=s.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.nextLine();
        System.out.println(solution(tc));
    }
}
