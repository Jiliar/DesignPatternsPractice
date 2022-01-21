package behaviors.iterator;

public class Main {
    public static void main (String args[]){
        PhoneBook guide = new PhoneBook();

        guide.add("123");
        guide.add("345");
        guide.add("567");
        guide.add("789");
        guide.add("321");

        Iterator iterator = new PhoneBookIterator(guide);

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
