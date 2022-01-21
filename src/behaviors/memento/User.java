package behaviors.memento;

public class User {

    private String name;
    private String lastname;
    private int age;

    public User(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    //Creating total backup with memento
    public User generateBackup(){
        return new User(this.getName(), this.getLastname(), this.getAge());
    }
    //Restore total backup with memento
    public void restoreBackup(User user){
        this.setName(user.getName());
        this.setLastname(user.getLastname());
        this.setAge(user.getAge());
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

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{ name = " + name + ", lastname = " + lastname +", age = " + age + '}';
    }
}
