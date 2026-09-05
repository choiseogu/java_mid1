package enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("HTTP CODE: ");
        int httpCodeInput = scanner.nextInt();
        HttpStatus httpStatus = HttpStatus.findByCode(httpCodeInput);

        printHttpStatusInfo(httpStatus);
    }

    public static void printHttpStatusInfo(HttpStatus status) {
        if (status == null) {
            System.out.println("정의되지 않은 코드");
            return;
        }
        System.out.println(status.getCode() + " " + status.getMessage());
        System.out.println("isSuccess = " + status.isSuccess());
    }
}
