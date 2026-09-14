package exception.ex3;

public class NetworkServiceV3_2 {
    public void sendMessage(String data) throws NetworkClientExceptionV3 {
        String address = "http://example.com";

        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        // 아래와 같이 계층별 예외 처리를 할 수도 있다.
        // 이때 위에서 아래의 순서로 차례대로 예외를 잡으므로 더 디테일한 예외 먼저 잡아야한다. 만약 Exception 예외를 먼저 잡는다면 모든 예외가 해당 예외에서만 잡히고 아래로는 내려가지 않는다.
        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) { // 특정 예외에 대해서만 처리할 수 있다.
            System.out.println("오류 주소: " + e.getAddress() + ", 메세지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) { // 상위 예외 클래스로 예외를 잡아서 전체 처리를 할 수 있다.
            System.out.println("[네트워크 오류] 메세지: " + e.getMessage());
        } catch (Exception e) { // 위 예외 외 내용을 모두 처리할 수 있다.
            System.out.println("[알 수 없는 오류] 메세지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
