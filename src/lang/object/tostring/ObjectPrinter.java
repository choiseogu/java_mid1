package lang.object.tostring;

public class ObjectPrinter {
    public static void print(Object obj) { //해당 메서드가 우리가 쓰는 println 메서드로 보면 된다.
        String string = "객체 정보 출력: " + obj.toString();
        System.out.println(string);
    }
}
