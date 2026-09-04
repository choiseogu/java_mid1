package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + user1.equals(user2));
        // Object의 equals() 는 == 을 기본으로 제공하기에
        // 해당 내용에서는 결국 동일성 비교가 진행된다.
        // 따라서, 클래스 내부에서 equals 메서드에 대해서 오버라이딩을 통해 해결해야한다.
    }
}
