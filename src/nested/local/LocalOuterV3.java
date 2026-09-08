package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstanceValue = 3;

    public Printer process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                System.out.println("localVar = " + localVar); // 인스턴스는 지역변수보다 생존주기가 더 길다
                System.out.println("paramVar = " + paramVar);

                System.out.println("outInstanceValue = " + outInstanceValue);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV3 = new LocalOuterV3();
        Printer process = localOuterV3.process(2); //반환값으로 인스턴스가 나온다.
        process.print(); //인스턴스를 생성하고 나서 따로 메서드를 호출 -> 여기서 지역변수가 사라지지 않고 생존한 모습을 볼 수 있다. 해당 내용의 생존 주기는 메서드 실행 동안인데 말이다.

        // 이는 java가 지역 클래스의 생존 주기가 지역 변수의 생존 주기보다 긴 문제를 "지역 변수 캡처"를 통해서 해결해주는 것이다.
        // java는 지역 클래스의 인스턴스 생성 시점에 지역 변수를 복사해서 인스턴스와 함께 넣어둔다. (스택 영역에서의 지역변수를 캡쳐해서 힙 영역으로 인스턴스와 함께 보관)
        // 이를 통해 메서드가 종료되어 지역 변수와 함께 스택 영역에서 없어져도 복사된 지역 변수에 접근하여 값을 가져올 수 있는 것이다.

        System.out.println("필드 확인");
        Field[] fields = process.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}