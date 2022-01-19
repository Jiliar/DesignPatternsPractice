package creationals.prototype;

//Class represents enemies in Space Invader Game
public class Enemy {

    private String image;
    private int posX;
    private int posY;
    private int lives;

    public Enemy(String image, int posX, int posY, int lives) {
        this.image = image;
        this.posX = posX;
        this.posY = posY;
        this.lives = lives;
    }

    //First mode to implement Prototype
    public Enemy(Enemy enemy){
        this.setImage(enemy.getImage());
        this.setPosX(enemy.getPosX());
        this.setPosY(enemy.getPosY());
        this.setLives(enemy.getLives());
    }

    //Second mode to implement Prototype
    public Enemy clone(){
        return new Enemy(this);
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

    public int getLives() {
        return lives;
    }
    public void setLives(int lives) {
        this.lives = lives;
    }

    @Override
    public String toString() {
        return "Enemy{ image= " + image + ", posX = " + posX +", posY = " + posY +", lives = " + lives + "}";
    }
}
