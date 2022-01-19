package structurals.composite;

import java.util.ArrayList;

public class Menu implements IMenu {

    private ArrayList<IMenu> menus;

    public Menu(){
        this.menus = new ArrayList<IMenu>();
    }

    @Override
    public boolean open() {
        System.out.println("¡Open!");
        menus.stream().forEach(x ->{
            Menu child = (Menu) x;
            System.out.println("Menu: "+x.toString()+" - N° Anidados: "+child.menus.size());
        });
        return true;
    }

    @Override
    public boolean close() {
        System.out.println("¡Close! ");
        return true;
    }

    public void addMenu(IMenu menu){
        this.menus.add(menu);
    }

    public IMenu getMenu(int pos){
        return this.menus.get(pos);
    }

    public Menu clone(){
        return new Menu();
    }

}
