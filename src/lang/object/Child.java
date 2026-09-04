package lang.object;

//아래와 같이 직접 extends를 명시하여 상속하는 것을 "명시적 상속"이라고 한다.
public class Child extends Parent {
    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}