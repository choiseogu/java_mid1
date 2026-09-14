package exception.ex1;

import java.util.Scanner;

//해당 내용에서는 오류 상황을 추가했는데, 결과를 보면 서버 연결에 실패를 해도 데이터를 전송하는 것을 볼 수 있다.
public class MainV1 {
    public static void main(String[] args) {
        //NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        //NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
        NetworkServiceV1_3 networkService = new NetworkServiceV1_3();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();

            if (input.contains("exit")) {
                break;
            }

            networkService.sendMessage(input);
        }
        System.out.println("프로그램 정상 종료");
    }
}
