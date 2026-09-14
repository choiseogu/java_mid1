package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 { // main 에서도 예외를 처리하지 않고 밖으로 던지기 때문에 프로그램이 종료된다.
        //NetworkClientV2_1 networkService = new NetworkClientV2_1();
        //NetworkClientV2_2 networkService = new NetworkClientV2_2(); // 정상 흐름과 예외 흐름이 섞이게 되며, 해당 클래스로는 disconnet가 호출되지 않을 때가 생긴다.
        //NetworkServiceV2_3 networkService = new NetworkServiceV2_3(); // 흐름 구분은 되었지만, disconnet()가 호출되지 않을 때가 생긴다.
        //NetworkServiceV2_4 networkService = new NetworkServiceV2_4();
        NetworkServiceV2_5 networkService = new NetworkServiceV2_5();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 정상 종료");
    }
}
