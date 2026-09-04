package lang.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20); //반환값이 참조값이므로 이에 맞는 클래스 타입 변수를 값을 받아줘야함.

        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);
    }
}
