package nested.local;

public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer {

            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);

                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        Printer printer = new LocalPrinter();
        //localVar = 4; //컴파일 오류 발생 -> 동기화 문제로 이어지기 때문에, 캡쳐된 변수는 후에 변경이 불가능하다.
        //paramVar = 5;

        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV4 = new LocalOuterV4();
        Printer process = localOuterV4.process(2);
        process.print();
    }
}
