package challenge.week1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {
    String name;
    LocalDate birthDay;

    public Student(String name, LocalDate birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    @Override
    public int compareTo(Student o) {
        return o.birthDay.compareTo(this.birthDay);
    }
}
public class w1_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 공백 제거
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] info = sc.nextLine().split(" ");
            String name = info[0];
            int day = Integer.valueOf(info[1]);
            int month = Integer.valueOf(info[2]);
            int year = Integer.valueOf(info[3]);
            LocalDate birthDay = LocalDate.of(year, month, day);
            list.add(new Student(name, birthDay));
        }

        Collections.sort(list);
        System.out.println(list.get(0).name);
        System.out.println(list.get(n - 1).name);
    }
}
