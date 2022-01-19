package creationals.singleton;

public class Main {
    public static void main (String args[]){
        DBConnection dbConnection1 = DBConnection.getConnectionDB();
        DBConnection dbConnection2 = DBConnection.getConnectionDB();
        //hashCode method returns a unique code, if we create two instance the code must be the same
        System.out.println(dbConnection1.hashCode());
        System.out.println(dbConnection2.hashCode());

        //If we update host and port attribute, these data will be the same for all instances
        dbConnection1.setHost("localhost");
        dbConnection1.setPort("8080");
        System.out.println("Instance Nª1: "+dbConnection1.getHost());
        System.out.println("Instance Nª1: "+dbConnection1.getPort());
        System.out.println("Instance Nª2: "+dbConnection2.getHost());
        System.out.println("Instance Nª2: "+dbConnection2.getPort());
    }
}
