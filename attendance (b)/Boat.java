
public class Boat extends Vehicle3 {

    protected String mainSailColor;

  
    public Boat(double speed, String color, double price, String mainSailColor) {
        this.speed = speed;
        this.color = color;
        this.price = price;
        this.mainSailColor = mainSailColor;
    }

   
    public void floatOnWater() {
        System.out.println("The boat is floating on water.");
    }

}
