package structurals.proxy;

public class User {
    private int id;
    private String name;
    private String lastName;
    private int role;

    /*
    *  Role's Information:
    *  1. Reader: This role is able to read
    *  2. Editor: This role is able to read, write and update
    *  3. Admin: This role has all permissions
    * */

    public User(int id, String name, String lastName, int role) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.role = role;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRole() {
        return role;
    }
    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{ id = " + id +", name = " + name + ", lastName = " + lastName + ", role = " + role +"}";
    }
}
