package creationals.builder_conditional;

public class User {

    //If I have to create some constructors because we have many optional attributes, we need to use Builder pattern
    private String name; /*Mandatory*/
    private String lastname; /*Mandatory*/

    private String email; /*Optional*/
    private String phone; /*Optional*/
    private String address; /*Optional*/

    private boolean isContact; /*Optional: [If this attribute is true then email, phone and address have values]*/

    private int payMethod; /*Optional: [If email, phone, address attributes has value then you would have one pay method: 0(None), 1 (Debit), 2 (Credit)]*/
    private String token; /*Optional: [If payMethod attribute is equal to 1 or 2 then you can generate token]*/

    //We need to create a private constructor with mandatory attributes.
    private User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;

        this.email = "";
        this.phone = "";
        this.address = "";

        this.isContact = false;
        this.payMethod = 0;
        this.token = "N/R";
    }

    //We need to create one static method
    public static User make(String name, String lastname){
        return new User(name, lastname);
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
    public boolean getIsContact() {
        return isContact;
    }
    public int getPayMethod() {return payMethod;}
    public String getToken() {return token;}

    public UserBuilder setIsContact(boolean isContact) {
        if(!isContact){
            throw new IllegalArgumentException("¡Is not possible assign false value if this there are a contact!");
        }
        this.isContact = isContact;
        return new UserBuilder(this);
    }

    @Override
    public String toString() {
        return "User{ name = " + name + ", lastname = " + lastname +
                ", email= " + email + ", phone = " + phone + ", " +
                "address = " + address + ", payMethod = "+payMethod+", "+
                "token = " + token+"}";
    }

    public static class UserBuilder{

        private User user;

        public UserBuilder(User user) {
            this.user = user;
        }

        //We need to modify sign and body of setters method
        public UserBuilder setEmail(String email) {
            user.email = email;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            user.phone = phone;
            return this;
        }

        public UserBuilder setAddress(String address) {
            user.address = address;
            return this;
        }

        public UserBuilder setPayMethod(int payMethod) {
            if(user.email.equals("") && user.phone.equals("") && user.address.equals("")){
                throw new IllegalArgumentException("¡Is not possible assign Pay Method if email, " +
                                                    "phone and address doesn't have value!");
            }
            user.payMethod = payMethod;
            return this;
        }

        public UserBuilder setToken(String token) {
            if(user.payMethod == 0 && !token.equals("N/R")){
                throw new IllegalArgumentException("¡Is not possible have Token if Pay Method isn't Debit (1) or Credit (2)!");
            }
            user.token = token;
            return this;
        }

        //We need to create one instance method
        public User build(){
            return user;
        }
    }

}
