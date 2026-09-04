package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello"); //new 명령어를 통한 객체 생성으로 각 다른 참조값을 갖게 된다.
        String str2 = new String("hello");
        System.out.println("(str1 == str2) = " + (str1 == str2));
        System.out.println("(str1.equals(str2)) = " + (str1.equals(str2)));

        String str3 = "hello"; //문자열 풀로 인해서 같은 참조값을 공유하게 되어 동일성 비교(==)에서도 true를 갖게 된다.
        String str4 = "hello";
        System.out.println("(str3 == str4) = " + (str3 == str4));
        System.out.println("(str3.equals(str4)) = " + (str3.equals(str4)));
    }
}