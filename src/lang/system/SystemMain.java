package lang.system;

import java.util.Arrays;

// System 클래스는 시스템과 관련된 기본 기능을 제공한다.
public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();// 현재 시간을 밀리초로 조회
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        long nanoTime = System.nanoTime(); // 현재 시간을 나노 초로 조회
        System.out.println("nanoTime = " + nanoTime);

        System.out.println("System.getenv() = " + System.getenv()); // 환경변수를 읽는다.

        System.out.println("System.getProperties() = " + System.getProperties()); // 시스템 속성 조회
        System.out.println("System.getProperty(\"java.version\") = " + System.getProperty("java.version"));

        //배열 고속 복사
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length); //반복문을 통한 복사보다 훨씬 빠른 속도를 제공한다.

        //배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString(copiedArray) = " + Arrays.toString(copiedArray)); // 문자 배열을 문자열로 변환
    }
}
