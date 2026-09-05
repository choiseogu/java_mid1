package lang.wrapper;

// 첫번째 한계인 "기본형은 객체가 아니다."를 해결해보자.
public class MyInteger {

    private final int value; //클래스를 불변으로 설계했다.
    // 또한 이를 보면 알 수 있듯, MyInteger라는 클래스는 단순한 기본형 변수를 하나 가지고 있는 것. 감싸고 있는 것이다.
    // 이를 통해서 기본형 int 값을 객체로 다루게 된다.

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) { // 숫자라는 객체에 메서드를 캡슐화 한다.
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
