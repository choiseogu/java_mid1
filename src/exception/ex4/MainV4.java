package exception.ex4;

import exception.ex3.NetworkClientExceptionV3;
import exception.ex3.NetworkClientV3;
import exception.ex3.NetworkServiceV3_2;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) throws NetworkClientExceptionV3 { // main 에서도 예외를 처리하지 않고 밖으로 던지기 때문에 프로그램이 종료된다.
        //NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램 정상 종료");
    }

    public static void exceptionHandler(Exception e) {
        //공통처리
        System.out.println("사용자 메세지 : 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("==개발자용 디버깅 메세지==");
        e.printStackTrace(System.out); // 스택 트레이스 출력.

        //필요 시 예외 별로 별도의 추가 처리 가능
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터 : " + sendEx.getSendData());
        }
    }
}