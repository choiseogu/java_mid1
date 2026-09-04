package lang.string;

public class CharArrayMain {

    public static void main(String[] args) {
        // java에서 문자를 다루는 기본적인 타입은 char과 String이 있다.
        char[] charArr = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(charArr);

        String str = "hello";
        System.out.println("str = " + str);

        // 해당 내용에서 알 수 있듯, 문자에 대한 기본형은 char만 있다. 이를 연결하여 문자(배)열을 만드는데, 이렇게 하기에 너무 불편하니
        // java에서는 String 클래스를 제공한다.
        // 즉, String은 기본형이 아닌 클래스임을 기억하자.
        // 즉, String은 참조값을 갖는다
        // 그래서 원래 String str1 = new String("hello") 로 객체를 선언하고 String 타입형 변수를 초기화하는데
        // 문자열이 자주쓰이는 만큼 자바에서는 이를 기본형 처럼 사용할 수 있게 해준다.
        // String 클래스를 직접 보면 char[] 형태로 문자들을 보관함을 알 수 있다. (java 9 이후로 byte[]로 바뀜)
    }
}