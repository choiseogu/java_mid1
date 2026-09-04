package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str); // 출력 시 hello 만 출력되면서 문자열이 합쳐진 내용을 확인할 수 없다.
        //이는 String 클래스의 객체가 불변 객체이기 때문이다.
        // .concat() 함수를 통해서는 새로운 불변 객체의 참조값이 반환되는데 이를 받는 Sting 타입 변수가 없기 때문에 반환값이 사라졌다.
        // String 객체는 문자열 풀에서도 관리가 되기 때문에 사이드 이팩트가 발생하기 쉽다. 따라서 불변객체로 관리된다.
    }
}