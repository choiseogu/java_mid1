package lang.object;

public class Parent { //해당 내용에서는 extends Object 가 생략되었다고 보면 된다. 즉, 자바가 직접 넣어준다. -> "묵시적 상속"
    // 모든 클래스의 최상위 부모는 Object이다.
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}