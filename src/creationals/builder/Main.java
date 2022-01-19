package creationals.builder;

public class Main {
    public static void main (String args[]){
        User user = User.make("George","Bush")
                        .setEmail("george.bush@gmail.com")
                        .setAddress("Washington DC")
                        .setPhone("+57 666 6666")
                        .build();
        System.out.println(user);
    }
}
