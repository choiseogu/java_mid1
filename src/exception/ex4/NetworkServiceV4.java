package exception.ex4;

public class NetworkServiceV4 {
    String address = "http://example.com";

    public void sendMessage(String data) {
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data); // NetworkClientExceptionV4 가 runtimeException이므로 throws 문법은 없어도 된다.
        } finally {
            client.disconnet();
        }
    }
}
