package exception.basic.checked;

public class Service {
    Client client = new Client();

    // 예외를 잡아서 처리 로직
    public void callCatch() {
        try {
            client.call(); // 해당 메서드를 통해서 MyCheckedException 타입의 예외를 받게 됨.
        } catch (MyCheckedException e) { // 해당 블록에서 잡음. (해당 내용에서는 상위 클래스인 Exception으로도 잡을 수 있음. Exception e = new MyCheckedException() 의 내용이 된다.
            //예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage()); // 잡은 예외 객체에서의 getMessage() 메서드를 통해서 오류 메세지 출력
        }
        // 예외를 잡았기에 정상 흐름으로 넘어감.
        System.out.println("정상 흐름");
    }

    // 체크 예외를 밖으로 던지는 코드
    public void callThrow() throws MyCheckedException { // 체크 예외는 예외를 잡지 않고 던지려면 throws 예외를 메서드에 필수로 선언해야 한다.
        client.call();
    }

    // 두 코드르 보고 알 수 있는 점은 특정 메서드에서 예외를 발생 시키면, try - catch를 통해서 예외를 잡거나, throws를 통해서 예외를 던지면 된다는 것이다. (둘 중 하나는 필수이다.)
}