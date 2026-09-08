package nested.anonymous.ex;

import java.util.Random;

public class EX1RefMain {

    public static void hello(ProcessClass process) {
        System.out.println("프로그램 시작");
        process.process();
        System.out.println("프로그램 종료");
    }

    static class Dice implements ProcessClass { //정적 중첩 반복문으로 하면 main에서 상위 클래스 인스턴스 생성 없이 바로 인스턴스를 생성할 수 있다.

        @Override
        public void process() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 : " + 6);
        }
    }

    static class Sum implements ProcessClass {

        @Override
        public void process() {
            for (int i = 0; i < 4; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        Sum sum = new Sum();

        hello(dice); //이와 같이 변하는 코드 조각을 인스턴스를 전달하여 그 안에서 해당 인스턴스에 접근하여 메서드(코드 조각)을 실행시키면 된다.
        hello(sum); //해당 내용에서는 다형적 참조를 통해서 여러 하위 타입의 인스턴스를 받을 수 있다는 점 또한 알고 넘어가자.
    }
}
