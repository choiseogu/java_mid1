package enumeration.ex3;

//Enum type
public enum Grade {
    BASIC, GOLD, DIAMOND,
    //지금까지의 내용을 이와 같이 java 가 제공해주는 Enum 타입을 통해서 쉽게 구현할 수 있다.
    //ex2의 ClassGrade 내용이 그대로 들어갔다고 보면 된다.

    //포인트
    //열거형(enum)도 클래스라는 점
    //열거형은 자동으로 java.lang.Enum을 상속받는다는 것
    //외부 객체 생성 불가하다는 점.(private)
}