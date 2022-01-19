package structurals.adapter;

public class DBAdapterBasic implements ISQLConnection{

    private INoSQLConnection noSQL;
    public DBAdapterBasic(INoSQLConnection noSQL){
        this.noSQL = noSQL;
    }

    @Override
    public void connect() {
        this.noSQL.connect();
    }

    @Override
    public String runQuery() {
        return this.noSQL.executeSentence();
    }
}
