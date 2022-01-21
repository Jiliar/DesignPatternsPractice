package structurals.fly_weight;

public class Main {
    //This Design pattern has a lot of benefits, for example creating of app with high performance and low resource's consumption
    public static void main (String args[]){
        CloudFactory factory = new CloudFactory();
        for (int x = 0; x < 100; x++){
            Cloud cloud = factory.getCloud(CloudType.BIG);
        }
        for (int x = 0; x < 200; x++){
            Cloud cloud = factory.getCloud(CloudType.MEDIUM);
        }
        for (int x = 0; x < 300; x++){
            Cloud cloud = factory.getCloud(CloudType.SMALL);
        }
        // We have 3 objects that represents more objects under environment
        System.out.println(factory.countCloudHashMap());
    }
}
