package exception.basic.unchecked;

public class UncheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch(); // 체크 예외 내용과 결과는 같다.
        //service.callThrow(); // 예외를 잡는 곳이 없으므로 main() 에서 최종적으로 예외가 터진다.
        System.out.println("정상 종료");
    }
}