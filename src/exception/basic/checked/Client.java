package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException { // throws 예외 : 발생시킨 예외를 메서드 밖으로 던짐 // throws (발생시킨 예외 타입) 형식을 띈다.
        throw new MyCheckedException("ex"); // throw 예외 : 새로운 예외를 발생 시킴 (예외도 객체이므로 new로 생성)
    }
}