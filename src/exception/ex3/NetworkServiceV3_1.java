package exception.ex3;

public class NetworkServiceV3_1 {
    public void sendMessage(String data) throws NetworkClientExceptionV3 {
        String address = "http://example.com";

        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) { // 각 예외에 대해서 catch로 처리할 수 있다.
            System.out.println("오류 주소: " + e.getAddress() + ", 메세지: " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("오류 주소: " + e.getAddress() + ", 메세지: " + e.getMessage());
        }
        // catch (ConnectException | SendException e) { 으로 여러 예외를 한번에 잡을 수도 있는데 이때 객체에 대한 메서드는 상위 클래스의 메서드만 사용가능하다.
        //     System.out.println("메세지: " + e.getMessage());
        // }
        finally {
            client.disconnect();
        }
    }
}
