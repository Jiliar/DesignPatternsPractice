package behaviors.strategy;

public class Main {
    public static void main (String args[]){

        Transaction transaction1 = new Transaction(new Deposit());
        System.out.println(transaction1.execTransaction(100, 200));

        Transaction transaction2 = new Transaction(new Retirement());
        System.out.println(transaction2.execTransaction(100, 20));

    }
}
