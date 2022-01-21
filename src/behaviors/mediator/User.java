package behaviors.mediator;

public class User implements ChatUser {

    private String name;
    private String lastname;

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public void sendMessage(String message){
        System.out.println(message);
    }

    public void receiveMessage(String message){
        System.out.println(message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "User{ name = " + name + ", lastname = " + lastname + '}';
    }
}
