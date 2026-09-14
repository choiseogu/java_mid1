package exception.ex2;

public class NetworkClientExceptionV2 extends Exception { // 예외도 객체이다. 따라서 필드, 생성자, 클래스 메서드를 가질 수 있다.
    private String errorCode;

    public NetworkClientExceptionV2(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
