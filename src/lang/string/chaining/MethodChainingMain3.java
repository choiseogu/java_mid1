package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();
        //메서드 체이닝을 통해 코드의 간결성과 가독성을 모두 챙길 수 있다.
        //참조값을 반환하기에 이와 같이 바로 참조하여 메서드를 사용하여 객체의 필드값을 바꾸는 것이다.
        System.out.println("result = " + result);
        // StringBuilder 클래스에서도 이와 같이 append() 연산에서 자기 자신의 참조값을 반환하기 때문에 method chaining이 가능하다.
    }
}