package behaviors.mediator;

import java.util.HashMap;

//Mediator class
public class ChatRoom {

    private HashMap<String, User> users;

    public ChatRoom(){
        this.users = new HashMap<String, User>();
    }

    public void addParticipant(User user){
        this.users.put(user.getName(), user);
    }

    public void sendMessage(User sender, User receiver, String message){
        if(this.users.get(sender.getName())!=null && this.users.get(receiver.getName())!=null){
            message = "From: "+sender.toString()+" Message: "+message;
            receiver.receiveMessage(message);
        }
    }

}
