package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java World.";

        System.out.println("str.contains(\"Java\") = " + str.contains("Java")); // 해당 문자열이 포함되는지
        System.out.println("str.indexOf(\"Java\") = " + str.indexOf("Java")); // 해당 문자열이 위치하는 첫번째 인덱스
        System.out.println("str.indexOf(\"Java\", 10) = " + str.indexOf("Java", 10)); // 10번 인덱스 이후에 해당 문자열이 위치하는 인덱스
        System.out.println("str.lastIndexOf(\"Java\") = " + str.lastIndexOf("Java")); //해당 문자열이 위치하는 마지막 인덱스
    }
}
