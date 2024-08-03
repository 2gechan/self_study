import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda_study {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("public");
        list.add("static");
        list.add("void");

        // 기존 익명 클래스 코드
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        // 람다 표현식 코드
        list.sort((Comparator<? super String>) (o1, o2) -> o1.compareTo(o2));

        /*
        파라미터 1개인 경우
        파라미터 괄호 생략 가능, 명령문 실행 함수를 감싸는 중괄호 생략 가능
        val1 -> System.out.println(val1);
         */

        /*
        파라미터 1개, 명령문 2개 이상인 경우
        파라미터 괄호 생략 가능, 함수 부분 중괄호 생략 불가능
        val1 -> {
            val1 = val1 + 1;
            System.out.println(val1);
            return val1;
        }
         */

        /*
        파라미터 2개 이상, 명령문 1개인 경우
        파라미터 괄호 생략 불가능
        명령문 함수 부분 중괄호 생략 가능
        (val1, val2) -> System.out.println(val1 + val2);
         */

        /*
        파라미터 2개 이상, 명령문 2개 이상인 경우
        둘다 괄호 생략 불가능
        (val1, val2) -> {
            System.out.println(val1);
            System.out.println(val2);
        }
         */


    }
}
