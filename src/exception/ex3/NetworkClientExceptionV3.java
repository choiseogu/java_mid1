package exception.ex3;

public class NetworkClientExceptionV3 extends Exception {
    public NetworkClientExceptionV3(String message) {
        super(message); // 상위 Throwable 클래스에 저장되는 message 이다.
    }


}
