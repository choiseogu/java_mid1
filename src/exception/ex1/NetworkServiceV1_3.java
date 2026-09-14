package exception.ex1;

public class NetworkServiceV1_3 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 networkClientV1 = new NetworkClientV1(address);
        networkClientV1.initError(data);

        String connectResult = networkClientV1.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
            // return; 을 없애고 분기를 사용하여 연결 오류와 입력 오류를 하나의 흐름에서 처리하고 disconnect() 메서드를 무조건 실행할 수 있게 바꾸었다.
        } else {
            String sendResult = networkClientV1.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }
        //하지만, 예외 흐름을 처리하는 부분이 더 많이 생기면서 보기 어렵게 되었다.
        //정상 흐름은 connect() -> send(data) -> disconnect() 일 뿐인데 말이다.
        networkClientV1.disconnect();
    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}