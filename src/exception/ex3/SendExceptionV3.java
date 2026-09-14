package exception.ex3;

public class SendExceptionV3 extends NetworkClientExceptionV3 {

    private final String address;

    public SendExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
