package nested.local;

public class LocalOuterV1 {
    private int outInstanceVar = 3;

    public void process(int paramVar) {

        int localVar = 1;

        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value); // 자신의 인스턴스 변수에 접근 가능
                System.out.println("localVar = " + localVar); // 자신이 속한 블록의 지역 변수에 접근 가능
                System.out.println("paramVar = " + paramVar); // 자신이 속한 블록의 매개 변수에 접근 가능
                System.out.println("outInstanceVar = " + outInstanceVar); // 바깥 클래스의 멤버 변수에 접근 가능
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }

}
