package behaviors.state;

public class Main {

    public static void main (String args[]){
        Car car = new Car();

        System.out.println("---- DRIVER 1 ----");
        //Car Driver 1
        car.moving();
        car.off();
        System.out.println("-----------------");

        System.out.println("---- DRIVER 2 ----");
        //Car Driver 2
        car.off();
        car.moving();
        System.out.println("-----------------");

        System.out.println("---- DRIVER 3 ----");
        //Car Driver 3
        car.off();
        car.on();
        car.off();
        car.on();
        car.moving();
        car.off();
        System.out.println("-----------------");
    }

}
