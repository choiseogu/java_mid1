package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10);  //해당 내용은 삭제될 내용이니 박싱 메서드 valueOf() 메서드를 사용하자.
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5); // interger 외 long, double 관련 wrapper 클래스도 있다.

        int intValue = integerObj.intValue(); //intValue, longValue 등의 언박싱 메서드로 기본형 내용으로 값을 가져올 수 있다.
        System.out.println("intValue = " + intValue);

        System.out.println("newInteger == integerObj = " + (newInteger == integerObj)); //해당 내용들은 Interger wrapper 클래스의 객체이다. 따라서 동일성 비교를 진행하면 참조값 끼리의 비교가 되므로 당연히 false가 나오게 된다.
        System.out.println("(newInteger.equals(integerObj)) = " + (newInteger.equals(integerObj))); // wrapper 클래스에서 제공하는 equals() 동등서 비교메서드를 사용하자.
    }
}