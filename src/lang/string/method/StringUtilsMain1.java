package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        String numString = String.valueOf(num);
        System.out.println("numString = " + numString); //숫자형 변수를 문자열 타입으로 변환 "100"
        String boolString = String.valueOf(bool);
        System.out.println("boolString = " + boolString); //불리언 변수 값을 문자열 타입으로 변환 "true"
        String objString = String.valueOf(obj);
        System.out.println("objString = " + objString); //참조형 변수 값을 문자열 타입으로 변환 "(참조값)"
        String numString2 = "" + num;
        System.out.println("numString2 = " + numString2); //문자열 + 숫자형 -> 문자열로 바뀜

        char[] strCharArray = str.toCharArray();
        System.out.println("strCharArray = " + strCharArray); // 문자열을 문자 배열로 변환, 참조값 출력됨.
        for (char c : strCharArray) {
            System.out.print(c);
        }
    }
}
