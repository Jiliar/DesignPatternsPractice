package behaviors.template_method;

public class Main {
    public static void main (String args[]){

        //This is the way of working about Manager
        User manager = new Manager();
        manager.auth();
        manager.wayOfWorking();

        //This is the way of working about Coordinator
        User coordinator = new Coordinator();
        coordinator.auth();
        coordinator.wayOfWorking();

    }
}
