package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpace = "   Java Programming";

        System.out.println("strWithSpace.toLowerCase() = " + strWithSpace.toLowerCase()); // 모두 소문자로 변환
        System.out.println("strWithSpace.toUpperCase() = " + strWithSpace.toUpperCase()); // 모두 대문자로 변환

        System.out.println("strWithSpace.trim() = " + strWithSpace.trim()); // 공백 제거
        System.out.println("strWithSpace.strip() = " + strWithSpace.strip()); // 공백 제거
        System.out.println("strWithSpace.stripLeading() = " + strWithSpace.stripLeading()); // 앞 공백 제거
        System.out.println("strWithSpace.stripTrailing() = " + strWithSpace.stripTrailing()); // 뒤 공백 제거
    }
}
