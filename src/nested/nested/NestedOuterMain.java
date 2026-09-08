package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
        NestedOuter nestedOuter = new NestedOuter();
        // 중첩 클래스 생성은 바깥 클래스.중첩클래스로 접근해서 생성할 수 있다.
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nested.getClass() = " + nested.getClass());
    }
}