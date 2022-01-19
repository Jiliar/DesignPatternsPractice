package creationals.prototype;

public class Main {
    public static void main (String args[]){

        //First mode to implement Prototype
        Enemy enemyBase = new Enemy("image1.png", 0,100, 2);
        Enemy enemy1 =new Enemy(enemyBase);
        Enemy enemy2 =new Enemy(enemyBase);
        Enemy enemy3 =new Enemy(enemyBase);
        Enemy enemy4 =new Enemy(enemyBase);

        enemy1.setPosX(100);
        enemy2.setPosX(150);
        enemy3.setPosX(200);
        enemy4.setPosX(250);

        System.out.println(" Hashcode : "+enemy1.hashCode()+" : "+enemy1);
        System.out.println(" Hashcode : "+enemy2.hashCode()+" : "+enemy2);
        System.out.println(" Hashcode : "+enemy3.hashCode()+" : "+enemy3);
        System.out.println(" Hashcode : "+enemy4.hashCode()+" : "+enemy4);

        //Second mode to implement Prototype
        Enemy enemy5 = enemyBase.clone();
        Enemy enemy6 = enemyBase.clone();
        Enemy enemy7 = enemyBase.clone();
        Enemy enemy8 = enemyBase.clone();

        enemy5.setPosX(100);
        enemy6.setPosX(150);
        enemy7.setPosX(200);
        enemy8.setPosX(250);

        System.out.println(" Hashcode : "+enemy5.hashCode()+" : "+enemy5);
        System.out.println(" Hashcode : "+enemy6.hashCode()+" : "+enemy6);
        System.out.println(" Hashcode : "+enemy7.hashCode()+" : "+enemy7);
        System.out.println(" Hashcode : "+enemy8.hashCode()+" : "+enemy8);

    }
}
