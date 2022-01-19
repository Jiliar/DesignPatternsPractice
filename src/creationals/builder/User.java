package creationals.builder;

public class User {

    //If I have to create some constructors because we have many optional attributes, we need to use Builder pattern
    private String name; /*Mandatory*/
    private String lastname; /*Mandatory*/

    private String email; /*Optional*/
    private String phone; /*Optional*/
    private String address; /*Optional*/

    //We need to create a private constructor with mandatory attributes.
    private User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;

        this.email = "";
        this.phone = "";
        this.address = "";
    }

    //We need to create one static method
    public static User make(String name, String lastname){
        return new User(name, lastname);
    }

    //We need to create one instance method
    public User build(){
        return this;
    }

    //We need to create Getters and Setters for optional attributes
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }

    //We need to modify sign and body of setters method
    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "User{ name = " + name + ", lastname = " + lastname + ", email= " + email + ", phone = " + phone + ", address = " + address + "}";
    }
}
