package lang.string.chaining;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        adder.add(1); // add() 메서드의 반환값인 본인의 참조값을 받는 변수는 없다. 하지만, 필드값 자체가 바뀌고 이를 getValue() 메서드로 가져오기에 문제는 없다.
        adder.add(2);
        adder.add(3);
        int result = adder.getValue();
        System.out.println("result = " + result);
    }
}
