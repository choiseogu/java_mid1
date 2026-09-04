package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result); // 불변 객체이므로 필드값을 바꿀 순 없으니, 변경값을 담은 새로운 불변객체를 만들어서 반환한다.
    }

    public int getValue() {
        return value;
    }
}
