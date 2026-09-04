package lang.object.equals;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        UserV2 user = (UserV2) object;
        return id.equals(user.id); // id 자체가 String 타입이니 equals 사용
    }
}
