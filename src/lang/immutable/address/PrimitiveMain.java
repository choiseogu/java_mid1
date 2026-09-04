package lang.immutable.address;

public class PrimitiveMain {

    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b); // 기본형 변수는 값을 절대로 공유하지 않는다.
        // "java는 항상 값을 복사해서 대입"한다

        b = 20;
        System.out.println("a = " + a); // side effect 없이
        System.out.println("b = " + b); // b 값만 바뀐걸 확인할 수 있다.
    }
}