package structurals.virtual_proxy;

public class Main {

    public static void main (String args[]){

        User user1 = new User(1, "George","Bush", 1);
        User user2 = new User(2, "Barak","Obama", 2);
        User user3 = new User(3, "George","Washington", 3);

        //Service is created when is needed, that's to say, service is create when user needs the service
        IService service1 = new ProxyService(user1);
        actions(service1);
        IService service2 = new ProxyService(user2);
        actions(service2);
        IService service3 = new ProxyService(user3);
        actions(service3);
    }

    public static void actions( IService service){
        System.out.println("-------------------------------");
        service.write();
        service.read();
        service.update();
        service.delete();
    }

}
