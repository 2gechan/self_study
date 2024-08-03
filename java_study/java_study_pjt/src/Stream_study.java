import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_study {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("public");
        list.add("static");
        list.add("void");

        // for문을 이용한 list 순회
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // stream forEach
        list.stream().forEach(str -> System.out.println(str));


        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> integerList1 = Arrays.asList(arr);
        List<Integer> result1 = new ArrayList<>();
        // 2의 배수 뽑기
        for (int i = 0; i < integerList1.size(); i++) {
            Integer num = integerList1.get(i);
            if (num % 2 == 0) {
                result1.add(num);
            }
        }

        for (int i = 0; i < result1.size(); i++) {
            System.out.println(result1.get(i));
        }

        // stream을 이용한 2의 배수 뽑기
        List<Integer> result2 =
                integerList1.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

        result2.stream().forEach(num -> System.out.println(num));


        // stream distinct
        Integer[] integerArray = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4,};
        List<Integer> integerList2 = Arrays.asList(integerArray);
        List<Integer> result3 = integerList2.stream().distinct().toList();
        result3.stream().forEach(num -> System.out.println(num));

        // stream map
        String[] distinctArr = {"public", "static", "void"};
        List<String> lowerCaseList = Arrays.asList(distinctArr);
        List<String> upperCaseList =
                lowerCaseList.stream().map(val -> val.toUpperCase()).toList();

        upperCaseList.stream().forEach(val -> System.out.println(val));

        /*
        collect(), toList()
        filter, distinct, map과 함께
        collect(), toList()를 사용하면 스트림을 간단하게 리스트로 만들 수 있다.
         */

    }
}
