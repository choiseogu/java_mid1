package exception.ex2;

public class NetworkServiceV2_4 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";

        NetworkServiceV2 client = new NetworkServiceV2(address);
        client.initError(data);

        try {
            client.connet(); // 정상 흐름과 예외 흐름이 구분이 되지만, 예외 발생 시 catch 블록으로 넘어가게 되므로, disconnect()가 실행되지 않는다.
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("오류 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        }

        client.disconnet(); //반드시 실행되야하는 내용을 따로 빼준다.
        // 하지만, 여기서 중요한 문제가 있다. 만약에 잡을 수 없는(고려하지 못 한) 예외가 발생하면 처리되지 않고 프로그램이 종료되기 때문에 disconnet() 함수도 실행되지 않는다.
        // 그렇다고 어떤 예외가 터질 것을 예상하고 catch 할 수 도 없다. 이때는 finally를 사용하면 된다.
    }
}