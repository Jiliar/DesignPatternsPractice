package structurals.adapter;

public interface ISQLConnection extends DBConnection{
    String runQuery();
}
