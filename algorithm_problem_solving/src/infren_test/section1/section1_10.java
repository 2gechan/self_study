package infren_test.section1;

import java.util.Scanner;

public class section1_10 {
    static int[] solution(String t1, char t2) {
        int[] answer=new int[t1.length()];
        int p=1000;
        for(int i=0; i<t1.length(); i++){
            if(t1.charAt(i)==t2){
                p=0;
                answer[i]=p;
            }
            else{
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for(int i=t1.length()-1; i>=0; i--){
            if(t1.charAt(i)==t2) p=0;
            else{
                p++;
                answer[i]=Math.min(answer[i], p);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        char c=sc.next().charAt(0);
        for(int x : solution(str, c)){
            System.out.print(x+" ");
        }

    }
}
