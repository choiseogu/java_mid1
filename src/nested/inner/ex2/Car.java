package nested.inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(); //this로 명시하여 의존할 필요가 없다. Engine은 내부 클래스로 이스턴스에 소속되기 때문이다.
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    class Engine { // 해당 클래스는 인스턴스에 소속되는 클래스로 바깥 클래스의 인스턴스를 참조하기 때문에 생성자를 가져와 Car 객체를 참조할 필요없다.
        public void start() {
            System.out.println("충전 레벨 확인: " + chargeLevel); //해당 내용을 ex1에서와 같이 car.get 으로 가져올 필요가 없다. 내부 클래스이기 때문에 private 멤버 변수에도 접근이 가능하기 때문에.
            System.out.println(chargeLevel + "의 엔진 구동");
        }
        // 이를 통해 불필요한 메서드를 제거했다.
    }
}