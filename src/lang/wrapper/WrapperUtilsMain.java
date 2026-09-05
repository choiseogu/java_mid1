package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf("10"); //문자열 숫자는 오토박싱이 안 되니 valueOf()를 사용하자, 반환값은 래퍼 클래스 타입이다.
        int i2 = Integer.parseInt("10"); //문자열 숫자를 래퍼 클래스가 아닌 기본형 숫자로 바꿀 때는 parseInt() 사용

        int compareResult = i1.compareTo(20); // 래퍼 클래스 값에 대한 비교는 compaerTo() 메서드로, 반환값은 기본형 int이다.
        System.out.println("compareResult = " + compareResult);

        // 래퍼 클래스 제공 연산자.
        System.out.println("Integer.sum(1, 2) = " + Integer.sum(1, 2));
        System.out.println("Integer.min(1, 2) = " + Integer.min(1, 2));
        System.out.println("Integer.max(1,2) = " + Integer.max(1,  2));
    }
}