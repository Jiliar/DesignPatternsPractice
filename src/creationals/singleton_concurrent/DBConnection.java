package creationals.singleton_concurrent;

public class DBConnection {

    public String host;
    public String port;

    public String getHost() {return host;}
    public void setHost(String host) {this.host = host;}
    public String getPort() {return port;}
    public void setPort(String port) {this.port = port;}

    //we need one private attribute. Classes can't access to it
    private static DBConnection dbConnection;

    //Constructor must be private
    private DBConnection(){}

    //We should create one static method that returns one Object with the same class
    //This method must have synchronized keyword, because without it method will create several instances.
    public synchronized static DBConnection getConnectionDB(){
        if(dbConnection == null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

}
