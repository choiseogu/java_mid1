package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        try {
            service.callThrow(); // 해당 메서드는 Client 에서 받은 예외를 처리하지 않고 본인을 호출한 메서드로 또 던진다.
            // 만약 try - catch 로 예외를 처리하지 않는다면 하단의 정상 종료는 출력되지 않고 main() 메서드는 예외 정보와 스택 트레이스를 출력하고 프로그램을 종료한다.
            // main() 메서드에서도 try - catch로 예외를 잡지 않고 던질거라면 main() 메서드에서 throws MyCheckedException을 명시해줘야 한다.
        } catch (MyCheckedException e) { // 따라서 마지막 메서드인 main() 메서드에서 예외를 잡아서 정상 흐름을 유지할 수 있다.
            System.out.println("예외 처리, 오류 메세지 : " + e.getMessage());
        }
        System.out.println("정상 종료");
    }
}
