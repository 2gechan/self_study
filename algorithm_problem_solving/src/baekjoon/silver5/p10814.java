package baekjoon.silver5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Member implements Comparable<Member> {
    int age;
    String name;
    int order;

    public Member(int age, String name, int order) {
        this.age = age;
        this.name = name;
        this.order = order;
    }

    @Override
    public int compareTo(Member o) {
        if (this.age == o.age) return this.order - o.order;
        else return this.age - o.age;
    }
}
public class p10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Member> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tc = sc.nextLine().split(" ");
            int age = Integer.parseInt(tc[0]);
            String name = tc[1];
            list.add(new Member(age, name, i));
        }
        Collections.sort(list);
        for (Member m : list) {
            System.out.println(m.age + " " + m.name);
        }
    }
}
