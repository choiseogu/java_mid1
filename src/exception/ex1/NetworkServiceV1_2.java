package exception.ex1;

public class NetworkServiceV1_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 networkClientV1 = new NetworkClientV1(address);
        networkClientV1.initError(data);

        String connectResult = networkClientV1.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
            return; //오류 발생 시 return으로 프로그램 종료를 하고 후의 데이터 전송을 막는다.
            //하지만 이 때문에 disconnet 메서드가 실행이 되지 않아. 처음에 만들고자 한 내용이 다르게 된다.
        }

        String sendResult = networkClientV1.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            return;
        }
        networkClientV1.disconnect();
    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}