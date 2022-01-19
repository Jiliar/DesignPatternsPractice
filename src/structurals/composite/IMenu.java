package structurals.composite;

public interface IMenu {

    boolean open();
    boolean close();
    void addMenu(IMenu menu);
    IMenu getMenu(int pos);
    public Menu clone();
}
