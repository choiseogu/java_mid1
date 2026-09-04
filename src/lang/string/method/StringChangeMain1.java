package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";

        System.out.println("str.substring(7) = " + str.substring(7)); // 7번 인덱스 이후부터의 부분 문자열
        System.out.println("str.substring(7,12) = " + str.substring(7, 12)); // 7번 ~ 12번 인덱스 부분 문자열
        System.out.println("str.concat(\"!!!\") = " + str.concat("!!!")); // 해당 문자열 str 뒤에 붙임

        System.out.println("str.replace(\"Java\", \"World\") = " + str.replace("Java", "World")); // Java를 World로 교체
        System.out.println("str.replaceFirst(\"Java\", \"World\") = " + str.replaceFirst("Java", "World")); // 첫번째 Java만 World로 교체
    }
}
