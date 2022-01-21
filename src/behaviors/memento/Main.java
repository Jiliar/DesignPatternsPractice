package behaviors.memento;

public class Main {
    public static void main (String args[]){
        System.out.println("------------------------------------");
        User user1 = new User("George", "Bush", 32);
        User user2 = new User("Barak","Obama", 43);
        System.out.println("Before changes");
        System.out.println(user1);
        System.out.println(user2);

        /*It's necesary to create object's backup before changes*/
        User mememto1 = user1.generateBackup();
        User mememto2 = user2.generateBackup();

        System.out.println("------------------------------------");
        user1.setName("Alex");
        user1.setLastname("Zurdo");
        user1.setAge(32);
        user2.setName("Willy");
        user2.setLastname("Gonzalez");
        user2.setAge(43);
        System.out.println("After changes");
        System.out.println(user1);
        System.out.println(user2);

        System.out.println("------------------------------------");
        user1.restoreBackup(mememto1);
        user2.restoreBackup(mememto2);
        System.out.println("Memento Backup");
        System.out.println(user1);
        System.out.println(user2);
    }
}
