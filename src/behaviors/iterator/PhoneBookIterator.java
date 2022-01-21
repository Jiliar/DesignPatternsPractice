package behaviors.iterator;

public class PhoneBookIterator implements Iterator{

    private PhoneBook guide;
    private int index;

    public PhoneBookIterator(PhoneBook guide) {
        this.guide = guide;
    }

    @Override
    public String next() {
        return this.guide.getNumbersPhone().get(this.index++);
    }

    @Override
    public boolean hasNext() {
        return this.index < this.guide.getNumbersPhone().size()
                && this.guide.getNumbersPhone().get(this.index) != null;
    }
}
