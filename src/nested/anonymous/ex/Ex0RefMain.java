package nested.anonymous.ex;

public class Ex0RefMain {

    public static void hello(String string) {
        System.out.println("프로그램 시작");
        System.out.println("hello " + string); // 강의 자료에서의 예시에서 변하는 부분 외 중복 내용을 제외하고 코드를 리팩토링하였다.
        // 이를 통해서 알 수 있는 건 프로그래밍에서 중복을 제거하고, 좋은 코드를 유지하는 핵심은 변하는 부분과 변하지 않는 부분에 대한 구분 및 분리이다.
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello("Java");
        hello("Spring");
    }
}
