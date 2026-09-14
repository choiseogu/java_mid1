package exception.ex2;

public class NetworkServiceV2 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkServiceV2(String address) {
        this.address = address;
    }

    public void connet() throws NetworkClientExceptionV2 {
        if (connectError) {
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패"); // 예외를 자신을 호출한 곳으로 던진다.
            // 코드를 보면 예외 상황 시 예외 객체를 만들고 던진다는 것이다. 별거 없다.
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2 {
        if (sendError) {
            throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송 실패");
        }
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnet() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.equals("error1")) {
            connectError = true;
        }

        if (data.equals("error2")) {
            sendError = true;
        }
    }
}