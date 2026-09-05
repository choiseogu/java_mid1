package enumeration.ex0;

//문자열과 타입 안정성1 -> String 타입 입력
public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC", price); //해당 내용에서는 BASIC 이라는 등급을 직접 입력하고 있다.
        int gold = discountService.discount("GOLD", price); //이는 오타 발생 및 유효 값 미입력(VIP)이 될 수 있다. -> 이를 타입 안정성 부족이라고 한다.
        int diamond = discountService.discount("DIAMOND", price); //또한 gold로 입력하면 소문자이기에 등급이 맞지 않게 된다. -> 이를 데이터 일관성이 없다고 한다.

        // 타입 안정성 부족 -> String으로 입력받고 있기 때문에 발생, 이는 런타임 오류이므로 디버깅도 어려움.
        // 이는 String 클래스를 사용함으로써는 해결할 수 없다.

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}