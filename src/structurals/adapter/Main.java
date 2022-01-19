package structurals.adapter;

public class Main {

    //ISQLConnection and NoSQLConnection have common methods connect() but interfaces have uncommon methods: runQuery() and executeSentence()
    //We need to create an Adapter to solve this situation.
    public static void main (String args[]){

        //Basic
        ISQLConnection connection1 = new DBAdapterBasic(new MongoDBConnection());
        connection1.connect();
        String result1 = connection1.runQuery();
        System.out.println(result1);

        ISQLConnection connection2 = new MySQLConnection();
        connection2.connect();
        String result2 = connection2.runQuery();
        System.out.println(result2);

        //Dependency Injection
        DBAdapterDI dbConnection1= new DBAdapterDI(new MySQLConnection());
        dbConnection1.connect();
        String result3 = dbConnection1.runQuery();
        System.out.println(result1);

        DBAdapterDI dbConnection2= new DBAdapterDI(new MongoDBConnection());
        dbConnection2.connect();
        String result4 = dbConnection2.executeSentence();
        System.out.println(result2);

        //Creating an exception: dbConnection2 can't runQuery because is a NoSQLConnection
        String result5 = dbConnection2.runQuery();
    }

}
