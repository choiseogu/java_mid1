package enumeration.ex1;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscoundService discoundService = new DiscoundService();
        int basic = discoundService.discount(StringGrade.BASIC, price); // StringGrade를 참조해서 가져온다면 오타 및 잘못된 입력을 방지할 수 있지만,
        int gold = discoundService.discount(StringGrade.GOLD, price);
        int diamond = discoundService.discount(StringGrade.DIAMOND, price);
        int gold1 = discoundService.discount("gold", price); //매개변수의 타입이 String임은 바뀌지 않았기에 잘못된 내용이 입력되는 걸 막을 수 없다. -> 타입 안정성 부족 및 데이터 일관서 부족

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);

        System.out.println("gold1 = " + gold1);
    }
}
