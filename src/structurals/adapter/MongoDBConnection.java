package structurals.adapter;

public class MongoDBConnection implements INoSQLConnection{

    @Override
    public void connect() {
        System.out.println("MongoDB connection OK");
    }

    @Override
    public String executeSentence() {
        return "Executing MongoDB sentence";
    }
}
