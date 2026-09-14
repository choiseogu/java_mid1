package exception.ex1;

public class NetworkServiceV1_1 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 networkClientV1 = new NetworkClientV1(address);
        networkClientV1.initError(data);

        networkClientV1.connect();
        networkClientV1.send(data);
        networkClientV1.disconnect();
    }
}
