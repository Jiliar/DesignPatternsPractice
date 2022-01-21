package structurals.fly_weight;

public class Cloud {

    private CloudType type;
    private String image;
    private int posX;
    private int posY;

    public Cloud(CloudType type, String image, int posX, int posY) {
        this.type = type;
        this.image = image;
        this.posX = posX;
        this.posY = posY;
    }

    public Cloud() {
    }

    public CloudType getType() {
        return type;
    }

    public void setType(CloudType type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public String toString() {
        return "Cloud { type = " + type +", image='" + image +", posX=" + posX +", posY=" + posY +"}";
    }
}
