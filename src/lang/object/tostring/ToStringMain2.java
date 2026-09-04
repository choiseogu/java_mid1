package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("ModelY");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내 toString");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        // 직접 정의 static 메서드 print()에서 앞에 "객체 정보 출력:" 이 붙는거 말고는 다 같은 내용이 출력된다.
        // 또한 Dog 클래스에서 오버라이딩 한 toString 메서드의 내용도 포함되어 있음을 확인할 수 있다.
    }
}