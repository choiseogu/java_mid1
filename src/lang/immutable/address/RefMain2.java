package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = new ImmutableAddress("서울");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b.setValue("부산") //컴파일 오류
        b = new ImmutableAddress("부산"); //새로운 객체를 생성하여 진행
        System.out.println("부산 -> b");
        System.out.println("a = " + a); //사이드 이팩트 없이 b의 주소만 바뀜을 볼 수 있다.
        System.out.println("b = " + b);
    }
}