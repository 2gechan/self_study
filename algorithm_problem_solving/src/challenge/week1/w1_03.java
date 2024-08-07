package challenge.week1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class w1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) return o1.compareTo(o2);
                else return o1.length() - o2.length();
            }
        });

        String prev = "";
        for (String x : arr) {
            if (x.equals(prev)) continue;
            System.out.println(x);
            prev = x;
        }
    }
}
