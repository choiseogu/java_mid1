package exception.basic.checked;

public class MyCheckedException extends Exception { // Exception을 상속 받았으므로, 해당 예외는 체크 예외가 된다.
    public MyCheckedException(String message) { // 생성자를 통해서 오류 메시지를 보관할 수 있다.
        super(message); // 해당 내용으로 전달된 메세지는 Throwable(상위 부모 클래스)에 있는 deatailMessage에 보관 됨. 보관된 내용은 getMessage()를 통해서 조회 가능.
    }
}