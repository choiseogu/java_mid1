package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV4 {

    public static void hello(ProcessClass process) {
        System.out.println("프로그램 시작");
        process.process();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        hello(new ProcessClass() {
            @Override
            public void process() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        });

        hello(new ProcessClass() {
            @Override
            public void process() {
                for (int i = 0; i < 4; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }
}