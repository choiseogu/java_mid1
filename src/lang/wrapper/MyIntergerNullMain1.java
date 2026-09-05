package lang.wrapper;

public class MyIntergerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));
    }

    public static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null; //이와 같이 MyInteger 타입으로 null 반환할 수 있게 된다. 기본형이였으면 대체인 -1 과 같은 숫자를 했어야 함.
    }
}