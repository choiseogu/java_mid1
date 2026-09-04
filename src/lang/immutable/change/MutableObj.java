package lang.immutable.change;

public class MutableObj {
    private int value;

    public MutableObj(int value) {
        this.value = value;
    }

    public void add(int addValue) { // 가변 객체인 MutableObj에서는 함수 내 필드 값 변경이 잘 적용됨을 알 수 있다.
        value += addValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
