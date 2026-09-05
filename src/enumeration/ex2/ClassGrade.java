package enumeration.ex2;

//타입 안전 열거형 패턴 -> 열거 내용만 사용 가능
public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(); //각 상수를 객체를 생성하여 초기화한다.
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();
    //static 으로 인해 메서드 영역에 생성된 상수들은 힙 영역의 생성된 각 인스턴스를 참조하면서 고유한 값을 갖는다.


    private ClassGrade() { //생성자를 private으로 막아, 다른 곳에서는 ClassGrade 클래스의 객체를 생성할 수 없게 한다.
    }

    // 해당 타입 안전 열거형 패턴을 통해서 타입 안정성 향상과 데이터 일관성을 이룰 수 있다.
}
