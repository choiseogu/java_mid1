package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        Class clazz = String.class; // 1. 클래스 자체에서 메타데이터 조회
        //Class clazz = new String().getClass(); // 2. 객체에서 클래스 메타데이터 조회
        //Class clazz = Class.forName("java.lang.String"); // 3. Class의 static 메서드를 사용한 이름으로 조회

        Field[] fields = clazz.getDeclaredFields(); // 클래스의 모든 필드 내용을 출력
        for (Field field : fields) {
            System.out.println("field.getType() = " + field.getType());
            System.out.println("field.getName() = " + field.getName());
        }

        Method[] methods = clazz.getDeclaredMethods(); // 클래스의 모든 메서드 출력
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        // 상위 클래스 정보 출력
        System.out.println("clazz.getSuperclass().getName() = " + clazz.getSuperclass().getName());

        // 인터페이스 정보 출력 (Class 클래스가 구현하고 있는 인터페이스 출력)
        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("i.getName() = " + i.getName());
        }
    }
}
