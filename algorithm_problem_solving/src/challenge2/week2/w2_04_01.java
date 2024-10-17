package challenge2.week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {
    int num;
    int cnt;
    int openTime;

    public Student(int num, int cnt, int openTime) {
        this.num = num;
        this.cnt = cnt;
        this.openTime = openTime;
    }

    @Override
    public int compareTo(Student o) {
        if (this.cnt == o.cnt) return this.openTime - o.openTime;
        else return this.cnt - o.cnt;
    }
}
public class w2_04_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Student> result = new ArrayList<>();
        Student[] students = new Student[101]; //최대 학생 수는 100명
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int stNum = arr[i];
            // 이미 게시된 학생
            if (students[stNum] != null) {
                students[stNum].cnt++;
            }
            // 처음 게시되는 학생
            else {
                if (result.size() == n) {
                    Collections.sort(result);
                    Student tmp = result.remove(0);
                    students[tmp.num] = null; // 추천횟수 초기화
                }
                Student addSt = new Student(stNum, 1, i);
                students[stNum] = addSt;
                result.add(addSt);
            }
        }
        Collections.sort(result, (s1, s2) -> s1.num - s2.num);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i).num + " ");
        }

    }
}
