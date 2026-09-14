package exception.basic.unchecked;

public class Service {
    Client client = new Client();

    public void callCatch() {

        // 언체크 예외는 필요 시에만 이렇게 잡아주면 된다. throws 를 원한다면 그냥 메서드만 호출하면 된다.
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리, 오류 메세지 : " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    // 언체크 예외이므로 throws 구문이 없어도 된다.
    public void callThrow() {
        client.call();
    }
}