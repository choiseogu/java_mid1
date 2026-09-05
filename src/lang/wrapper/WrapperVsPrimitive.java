package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long startTime, endTime;

        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("(endTime - startTime) = " + (endTime - startTime));

        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i; // 오토 박싱
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("(endTime - startTime) = " + (endTime - startTime));
    }
    //기본형은 단순히 그 숫자의 크기만을 저장하는데,
    //wrapper 객체는 객체의 메타데이터까지 다루기 때문에 차지하는 메모리가 커지고, 오토박싱이 매 반복문에서 일어나게 된다.
}
