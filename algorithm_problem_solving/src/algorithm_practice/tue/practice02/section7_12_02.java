package algorithm_practice.tue.practice02;

import java.util.*;

public class section7_12_02 {
    static int[] arr;


    static void solution(List<ArrayList<Integer>> list) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        arr[1] = 0;
        while (!q.isEmpty()) {
            int num = q.poll();
            int distance = arr[num];
            for (int x : list.get(num)) {
                if (arr[x] > distance + 1) {
                    arr[x] = distance + 1;
                    q.offer(x);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n + 1];
        Arrays.fill(arr, Integer.MAX_VALUE);
        List<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            list.get(s).add(e);
        }
        solution(list);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + arr[i]);
        }
    }
}
