import java.util.Optional;

public class Optional_study {

    // 무조건 null을 반환하는 메서드
    public static String getNull() {
        return null;
    }

    // Optional은 nulll을 반환하는 것이 아닌 비어있는 Optional을 반환
    public static Optional<String> getOptionalNull() {
        return Optional.empty();
    }

    public static Optional<String> getOptionalValue() {
        return Optional.ofNullable("public static void");
    }

    public static void main(String[] args) {
        /*
        Optional은 null이 들어 있는 레퍼런스 변수의 멤버(필드, 메서드)에 접글하려고 할 때
        발생하는 예외인 NullPotionException을 해결하기 위해 등장
         */

        // 보통의 null check logic
        String isThisNull = getNull();
        if (null != isThisNull) {
            System.out.println(isThisNull.toUpperCase());
        }

        // Optional 사용 시
        Optional<String> isThisOptionalNull = getOptionalNull();
        // empty가 아닌 경우 ifPresent의 인자로 들어간 람다 표현식 실행
        isThisOptionalNull.ifPresent(str -> System.out.println(str.toUpperCase()));
        Optional<String> isThisOptionalString = getOptionalValue();
        isThisOptionalString.ifPresent(str -> System.out.println(str));

        // Optional 안티 패턴
        if (isThisOptionalNull.isPresent()) {
            System.out.println(isThisOptionalNull.get().toUpperCase());
        }

    }
}
