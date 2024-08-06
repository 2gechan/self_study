package challenge.week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Member implements Comparable<Member> {
    int ord;
    int age;
    String name;

    @Override
    public int compareTo(Member o) {
        if (this.age == o.age) return this.ord - o.ord;
        else return this.age - o.age;
    }

    public Member(int ord, int age, String name) {
        this.ord = ord;
        this.age = age;
        this.name = name;
    }
}
public class w1_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // nextInt()를 사용 후 개행 문자 제거
        List<Member> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] info = sc.nextLine().split(" ");
            list.add(new Member(i, Integer.valueOf(info[0]), info[1]));
        }
        Collections.sort(list);
        for (Member member : list) {
            System.out.println(member.age + " " + member.name);
        }
    }
}
