package nested.anonymous.ex;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Ex1RefMainV5 {

    public static void hello(ProcessClass process) {
        System.out.println("프로그램 시작");
        process.process();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        hello(() -> { // 이와 같이 람다를 통해서 코드 블록을 직접 전달함을 진행할 수 있다. 따로 익명 클래스 선언과 인스턴스 생성 없이!
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });

        hello(() -> {
            for (int i = 0; i < 4; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}