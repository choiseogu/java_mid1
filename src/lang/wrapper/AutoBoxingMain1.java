package lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        // 기본형 -> 래퍼 클래스 객체 : 박싱 (래퍼로 감싸니까 박싱)
        int value = 7;
        Integer boxedValue = Integer.valueOf(value); //아래의 경고를 보면 unnecessary 라고 뜬다. 오토박싱이 제공되기 때문이다.

        // 래퍼 클래스 객체 -> 기본형 : 언박싱 (감싸져 있는 래퍼를 벗기니까 언박싱)
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

        Integer autoBoxedValue = value; // 컴파일 단계에서 자바가 Integer.valueOf()를 추가해준다.
        int autoUnboxedValue = boxedValue; // 컴파일 단계에서 자바가 .intValue()를 추가해준다.
        System.out.println("autoboxedValue = " + autoBoxedValue);
        System.out.println("autounboxedValue = " + autoUnboxedValue);
    }
}
