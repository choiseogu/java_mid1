package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder.add(2);
        ValueAdder adder3 = adder.add(3);
        int result = adder.getValue(); //필드값을 조회하면 최종결과를 확인할 수 있다. 참조값은 모두 공유하고 있기 때문에 어떤 객체로 조회하든 상관없다.
        System.out.println("result = " + result);

        //하지만, 해당 코드는 보기 매우 불편한 내용이 된다.
    }
}