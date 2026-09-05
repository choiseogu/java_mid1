package lang.math;

public class MathMain {
    public static void main(String[] args) {
        System.out.println("Math.max(1,2) = " + Math.max(1, 2));
        System.out.println("Math.min(1,2) = " + Math.min(1, 2));
        System.out.println("Math.abs(-1) = " + Math.abs(-1));

        System.out.println("Math.ceil(2.1) = " + Math.ceil(2.1)); //올림
        System.out.println("Math.floor(2.7) = " + Math.floor(2.7)); //내림
        System.out.println("Math.round(2.5) = " + Math.round(2.5)); //반올림

        System.out.println("Math.sqrt(4) = " + Math.sqrt(4)); //제곱근
        System.out.println("Math.random() = " + Math.random()); // 0.0 ~ 1.0 사이의 랜덤수
    }
}
