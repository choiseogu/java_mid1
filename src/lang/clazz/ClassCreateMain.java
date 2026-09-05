package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Class.forName("lang.clazz.Hello");
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        // helloClass라는 클래스 메타데이터를 통해서 객체를 생성. 해당 내용으로 클래스 생성 시 Object 타입으로 생성되어 다운 캐스팅 진행.

        String hello1 = hello.hello(); // 객체에 대한 내용 진행은 앞에서 했던 내용과 동일하다.
        System.out.println("hello1 = " + hello1);
    }
}