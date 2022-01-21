package structurals.fly_weight;

import java.util.HashMap;

public class CloudFactory {

    private HashMap<CloudType, Cloud> cloudsMap;

    public CloudFactory(){
        this.cloudsMap = new HashMap<CloudType, Cloud>();
    }

    //This method create objects that not exist under map
    public Cloud getCloud(CloudType type){
        Cloud cloud = this.cloudsMap.get(type);
        if(cloud == null){
            cloud = new Cloud(type,"cloud.png",100,100);
            this.cloudsMap.put(type, cloud);
        }
        return cloud;
    }

    //Method to know how many clouds we have store in Hashmap
    public int countCloudHashMap(){
        return this.cloudsMap.size();
    }

}
