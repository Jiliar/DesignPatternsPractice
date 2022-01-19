package creationals.singleton_concurrent;

import creationals.singleton.DBConnection;

public class Main {

    public static void main (String args[]){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                DBConnection dbConnection = DBConnection.getConnectionDB();
                System.out.println(dbConnection.hashCode());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                DBConnection dbConnection = DBConnection.getConnectionDB();
                System.out.println(dbConnection.hashCode());
            }
        });
        t1.start();
        t2.start();
    }

}
