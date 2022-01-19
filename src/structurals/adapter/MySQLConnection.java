package structurals.adapter;

public class MySQLConnection implements ISQLConnection {

    @Override
    public void connect() {
        System.out.println("MySQL connection OK");
    }

    @Override
    public String runQuery() {
        return "Executing MySQL Statement";
    }

}
