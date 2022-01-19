package creationals.abstract_factory;

//Appliying Dependency Inversion principle. Example: ITablet ipad = appleStore.createTablet(...)
//Method: createTablet() returns one Object

public class Main {

    public static void main (String args[]){

        SamsungStore samsungStore = new SamsungStore();
        AppleStore appleStore = new AppleStore();
        IComputer macbook = appleStore.createComputer(1, "PRO", 2022, 14000000);
        ITablet ipad = appleStore.createTablet(2, "Gen 9", 2022, 4500000);

        IComputer samsungComputer = samsungStore.createComputer(3, "ChromeBook", 2022, 6000000);
        ITablet s3tab = samsungStore.createTablet(4, "Galaxy S7", 2022, 4000000);

        System.out.println(macbook);
        System.out.println(ipad);
        System.out.println(samsungComputer);
        System.out.println(s3tab);

    }

}
