package exception.basic.checked;

public class CheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch(); // 예외를 service 객체에서 잡아서 처리하므로 main 메서드까지 올라오지 않는다.
        System.out.println("정상 종료"); // 따라서 main 메서드는 정상 종료를 출력한다.
    }
}

// 예외 처리 흐름
// 1. main() 호출 -> service.callCatch() 호출 -> client.call() 호출 : 해당 지점에서 예외 발생, client.call() 메서드에서는 예외를 생성해서 던짐.
// 2. client.call() ----예외 던짐---> service.callCatch()에서 예외 처리 -> main()에서는 정상 흐름