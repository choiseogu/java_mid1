package enumeration.ref2;

//위 ref1의 내용을 열거형에서도 그대로 적용해보자.
//열거형도 클래스이다. 생성자를 활용하자.
public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30),
    ;

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}