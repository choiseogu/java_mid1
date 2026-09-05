package enumeration.ref1;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        return price * classGrade.getDiscountPercent() / 100; //Enum의 생성자를 통해서 할인율을 등급이 정해지는 시점에서 바로 가져올 수 있다.
    }
}
