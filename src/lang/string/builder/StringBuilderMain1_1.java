package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        // String은 불변 객체이기 때문에 concat()과 같은 메서드 사용에 있어 계속해서 새로운 객체를 만들어야 하는 비효율성과 GC 부담이 느는 단점이 있어.
        // 변경이 자주 있는 문자열을 포함한 내용이라면 가변 문자열 클래스인 StringBuilder를 사용하자
        StringBuilder sb = new StringBuilder();
        sb.append("A"); //sb는 가변 객체이기 때문에 반환값을 받을 필요 없이 객체의 필드값이 바로 바뀐다.
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        //대신 사이드이팩트에 주의해야하기 때문에, StringBuilder는 문자 변경 과정에서만 사용 후 다시 String 타입을 변경하는 것이 좋다.
        // 그런데 이러한 내용을 Java에서 직접 최적화하기도 한다. -> 문자열 + 연산과 같은 내용에서 StringBuilder 객체를 만들어 처리하고 Sting 타입을 되돌린다.
        // 하지만, 반복문 안에서 + 연산이 진행되는 경우 반복 내에서는 가변 객체를 생성하여 최적화를 해주지만, 반복 횟수만큼의 객체 생성이 될 수 밖에 없다.
        // 이럴 때 StringBuilder로 반복을 진행하고 String 타입으로 변환해주면 된다.
    }
}
