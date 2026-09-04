package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a); // 참조값을 공유하게 되므로 side effect 발생
        System.out.println("b = " + b);

        //위의 사이드 이팩트를 해결하기 위해서는 객체 자체를 새로 만들어서 b가 참조하게 해줘야 한다.
        //그러면 a, b 각 각 다른 참조값을 참조하므로 내용을 바꾼다고 해도 다른 객체 참조에 영향을 주지 않는다.
    }
}
