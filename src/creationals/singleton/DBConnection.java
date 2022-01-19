package creationals.singleton;

public class DBConnection {

    private String host;
    private String port;

    public String getHost() {return host;}
    public void setHost(String host) {this.host = host;}
    public String getPort() {return port;}
    public void setPort(String port) {this.port = port;}

    //we need one private attribute. Classes can't access to it
    private static DBConnection dbConnection;

    //Constructor must be private
    private DBConnection(){}

    //We should create one static method that returns one Object with the same class
    public static DBConnection getConnectionDB(){
        if(dbConnection == null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

}
