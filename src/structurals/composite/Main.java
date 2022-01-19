package structurals.composite;

public class Main {
    public static void main (String args[]){
        Menu menuBase = new Menu();

        //Using Prototype Design Pattern
        Menu menu1 = menuBase.clone();//father about menu2 and menu3
        Menu menu2 = menuBase.clone(); //Child from menu 1
        Menu menu3 = menuBase.clone(); //father about menu4 and menu5, Child from menu 1
        Menu menu4 = menuBase.clone(); //Child from menu 3
        Menu menu5 = menuBase.clone(); //Child from menu 3

        menu3.addMenu(menu4);
        menu3.addMenu(menu5);

        menu1.addMenu(menu2);
        menu1.addMenu(menu3);

        menu1.open();
        menu1.close();

    }
}
