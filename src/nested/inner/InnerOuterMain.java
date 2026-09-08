package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); // 인스턴스에 소속되는 클래스 이므로 이와 같이 호출해야한다. InnerOuter.Inner로 호출은 불가
        inner.print();

        System.out.println("inner.getClass() = " + inner.getClass());
    }
}
