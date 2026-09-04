package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) { //이와 같이 Object 다형성을 이용하여 Object 타입의 매개변수에 Dog, Car 클래스의 객체를 넣을 수 있다
        //obj.sound(); //이는 Object 클래스에는 sound() 메서드가 없기 때문에 불가능하다.

        // 객체에 맞춰 다운캐스팅
        // 이와 같이 다운 캐스팅을 통해서만 객체의 메서드를 가져와야함이 한계가 된다.
        // Object 타입 변수이므로 자식으로 내려가서 메서드를 호출할 수가 없기 때문이다.
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}