package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(20); //가변 객체의 함수이므로 필드값이 잘 바뀌어 나옴을 확인할 수 있다.
        System.out.println("obj.getValue() = " + obj.getValue());
    }
}
