package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV2 {

    public static void hello(ProcessClass process) {
        System.out.println("프로그램 시작");
        process.process();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        class Dice implements ProcessClass { // 지역 클래스는 내부 클래스와 static 선언없이 진행한다.

            @Override
            public void process() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        }

        class Sum implements ProcessClass {

            @Override
            public void process() {
                for (int i = 0; i < 4; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        Dice dice = new Dice();
        Sum sum = new Sum();
        hello(dice);
        hello(sum);
    }
}