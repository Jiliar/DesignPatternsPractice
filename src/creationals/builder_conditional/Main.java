package creationals.builder_conditional;

public class Main {
    public static void main (String args[]){
        User user = User.make("George","Bush")
                        .setIsContact(true)
                        .setEmail("george.bush@gmail.com")
                        .setAddress("Washington DC")
                        .setPhone("+57 666 6666")
                        .setPayMethod(0)
                        .build();
        System.out.println(user);
    }
}
