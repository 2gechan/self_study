package infren_test.section1;

import java.util.*;

public class section1_06 {
    static String solution(String str){
        String answer="";
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
            // indexOf() 해당 문자가 처음으로 나온 위치, i와 처음 나온 위치가 같다면 처음으로 발견한 문자이기 때문에 추가
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.nextLine();
        System.out.println(solution(tc));

    }
}
