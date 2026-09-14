package exception.ex2;

public class NetworkServiceV2_3 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";

        NetworkServiceV2 client = new NetworkServiceV2(address);
        client.initError(data);

        try {
            client.connet(); // 정상 흐름과 예외 흐름이 구분이 되지만, 예외 발생 시 catch 블록으로 넘어가게 되므로, disconnect()가 실행되지 않는다.
            client.send(data);
            client.disconnet();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("오류 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        }
        // 해당 메서드에서는 예외를 처리하지 않고 던진다.
    }
}