package structurals.adapter;

//Adapter works like a bridge between client and interfaces
public class DBAdapterDI implements INoSQLConnection, ISQLConnection {

    private INoSQLConnection noSQL;
    private ISQLConnection sql;

    public DBAdapterDI(INoSQLConnection noSQL){
        this.noSQL = noSQL;
    }

    public DBAdapterDI(ISQLConnection sql){
        this.sql = sql;
    }

    public void connect() {
        if(this.noSQL != null){
            this.noSQL.connect();
        }else{
            this.sql.connect();
        }
    }

    public String runQuery() {
        String answer = "";
        if(this.sql == null){
           throw new IllegalArgumentException("¡There is no persistent SQL connection, you can't run query!");
        }
        return this.sql.runQuery();
    }

    public String executeSentence() {
        String answer = "";
        if(this.noSQL == null){
            throw new IllegalArgumentException("¡There is no persistent NoSQL connection, you can't execute statement!");
        }
        return this.noSQL.executeSentence();
    }

}
