package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        String[] splitStr = str.split(","); // , 기준 분할 후 배열 저장
        for (String string : splitStr) {
            System.out.println(string);
        }

        String joinedStr = String.join("-", "A", "B", "C"); // 첫번째 인자로 이후 인자들을 연결
        System.out.println("연결된 문자열: " + joinedStr);

        String result = String.join("-", splitStr);
        System.out.println("배열 원소 연결: " + result);
    }
}