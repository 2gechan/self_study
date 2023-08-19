package level1;

import java.util.Scanner;

// (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
// (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
// 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
public class baekjoon10430 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("숫자 a >> ");
        int a = scan.nextInt();
        System.out.print("숫자 b >> ");
        int b = scan.nextInt();
        System.out.print("숫자 c >> ");
        int c = scan.nextInt();
        // 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }
}
