package lang.immutable.address;

public class ImmutableAddress {

    private final String value; // final(불변)으로 설정하여 ide에서도 setter 자체가 뜨지 않음.

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
