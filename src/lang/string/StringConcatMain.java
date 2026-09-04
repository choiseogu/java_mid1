package lang.string;

public class StringConcatMain {
    // 앞서 String은 기본형이 아닌 클래스라고 했다. 따라서, String 객체는 "참조값"을 갖기에 + 연산자는 사용할 수 없어야 한다.
    // 따라서 문자열을 합치고 싶다면 .concat() 함수를 사용해야하는데, 자바에서 편의상 문자열에 + 연산을 제공한다.

    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}