package exception.ex2;

public class NetworkServiceV2_1 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";

        NetworkServiceV2 client = new NetworkServiceV2(address);
        client.initError(data);

        client.connet();
        client.send(data);
        client.disconnet();

        // 해당 메서드에서는 예외를 처리하지 않고 던진다.
    }
}