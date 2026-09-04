package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        System.out.println(string);

        System.out.println(object); //해당 println 함수 내 toString이 포함되어 있어. 위와 같은 결과가 나온다.
        // 결과는 객체의 참조값(해시코드)를 16진수로 제공
    }
}