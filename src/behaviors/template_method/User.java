package behaviors.template_method;

public abstract class User {

    public void auth(){
        System.out.println("¡Everybody needs to be authenticated!");
    }

    public abstract void wayOfWorking();
}
