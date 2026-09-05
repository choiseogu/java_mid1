package enumeration.ex2;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        if (classGrade == ClassGrade.BASIC) { //문자열 비교가 아니라 참조값 비교이므로 == 동일성 비교를 하면 된다.
            discountPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        }

        return price * discountPercent / 100;
    }
}
