package exception.ex2;

public class NetworkServiceV2_2 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";

        NetworkServiceV2 client = new NetworkServiceV2(address);
        client.initError(data);

        // 예외 처리는 하지만, 정상 흐름과 예외 흐름이 섞여있어 쉽게 보기 힘들다.
        try {
            client.connet();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("오류 코드: " + e.getErrorCode() +", 메세지: " + e.getMessage());
            return; //여기서 return으로 함수를 빠져나오지 않으면 error2로 오류를 잡는 아래 내용이 문제 없이 진행되어 error1을 전송하게 된다.
        }

        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("오류 코드: " + e.getErrorCode() +", 메세지: " + e.getMessage());
            return;
        }

        client.disconnet();

        // 해당 메서드에서는 예외를 처리하지 않고 던진다.
    }
}