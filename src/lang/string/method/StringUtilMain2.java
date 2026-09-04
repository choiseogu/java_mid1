package lang.string.method;

public class StringUtilMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println("format1 = " + format1); //문자열 포맷팅

        String format2 = String.format("숫자: %.2f", 10.1234);
        System.out.println("format2 = " + format2); //실수형 값 소수점 2번째자리까지 출력

        System.out.printf("숫자: %.2f", 10.1234);

        String regex = "Hell, (Java!|World)";
        System.out.println("str.matches(regex) = " + str.matches(regex)); // str 문자열이 regex 형식과 일치하는가
    }
}