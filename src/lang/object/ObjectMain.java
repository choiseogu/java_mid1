package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod(); //본인 메서드
        child.parentMethod(); //상속받은 부모 메서드

        System.out.println(child.toString());
        //Object 클래스의 메서드. Object 클래스가 최상위 부모이므로 명시적 상속을 받는 자식 또한 사용 가능하다.
        // 추가적으로, toString() 메서드는 객체의 정보를 제공하는 메서드라고 생각하면 된다.

        //결국, new Child(); 를 통해 객체를 생성함으로써 부모인 Parent, 최상위 부모인 Object 모두 메모리에 함께 생성된다.
    }
}
