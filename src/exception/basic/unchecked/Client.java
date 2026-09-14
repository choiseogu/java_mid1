package exception.basic.unchecked;

public class Client {
    public void call() { // 언체크 예외 이므로 throws가 없어도 됨.
        throw new MyUncheckedException("ex");
    }
}