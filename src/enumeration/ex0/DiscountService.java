package enumeration.ex0;

//문자열과 타입 안정성1 -> String 타입 입력
public class DiscountService {
    public int discount(String grade, int price) {
        int discountPercent = 0;

        if (grade.equals("BASIC")) {
            discountPercent = 10;
        } else if (grade.equals("GOLD")) {
            discountPercent = 20;
        } else if (grade.equals("DIAMOND")) {
            discountPercent = 30;
        } else {
            System.out.println(grade + ": 할인 x");
        }

        return price * discountPercent / 100;
    }
}
