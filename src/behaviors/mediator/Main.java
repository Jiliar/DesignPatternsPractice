package behaviors.mediator;

public class Main {

    public static void main (String args[]){
        User user1 = new User("George", "Bush");
        User user2 = new User("Barak","Obama");
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.addParticipant(user1);
        chatRoom.addParticipant(user2);
        chatRoom.sendMessage(user1, user2, "Hello World! :)");
    }

}
