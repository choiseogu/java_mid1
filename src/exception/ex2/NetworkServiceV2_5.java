package exception.ex2;

public class NetworkServiceV2_5 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";

        NetworkServiceV2 client = new NetworkServiceV2(address);
        client.initError(data);

        try {
            client.connet();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("오류 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        } finally {
            client.disconnet(); // try~catch에 상관없이 어떤 상황에서든 무조건 실행되는 블록이다.
            // 해당 내용은 catch 블록 없이도 구성가능하다.
        }

        //최종적으로 이와 같은 내용을 통해서 정상흐름과 예외흐름을 구분할 수 있고 여러 예외 상황에 대해서 대처할 수 있게 된다.
    }
}