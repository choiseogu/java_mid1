package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] splits = email.split("@");
        System.out.println("ID = " + splits[0]);
        System.out.println("Domain = " + splits[1]);
    }
}