package nested.nested.ex1;

//해당 클래스는 Network 클래스에서만 쓰이고 Main에서는 쓰이지 않는다.
//이러한 관계에 있어서는 NetworkMessage 클래스를 중첩 클래스로 두는게 낫다.
public class NetworkMessage {
    private String content;

    public NetworkMessage(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }
}