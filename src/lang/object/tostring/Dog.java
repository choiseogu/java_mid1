package lang.object.tostring;

public class Dog {
    private String dogName;
    private int age;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    //이와 같이 toString을 오버라이딩 하여 객체에 대한 정보를 좀 더 보기 쉽게 만들 수 있다.
    //toSting() 자체가 객체의 정보를 나타내는 함수이기도 하니까
    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}
