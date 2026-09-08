package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // 이와 같이 new 명령어를 통해서 익명 클래스의 인스턴스가 동시에 생성되니 이때 단 한번만 인스턴스를 사용할 수 있고, 이후는 생성할 수 없다. 이름이 없기에 생성자도 가지지 못 한다.
        Printer printer = new Printer() { // 익명 클래스를 통해서 LocalOuterV2 내용의 지역 클래스를 선언과 생성을 동시에 진행했다.
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.getClass() = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter anonymousOuter = new AnonymousOuter();
        anonymousOuter.process(2);
    }
}
