
public class FandangoYacht extends Boat {
   
    public FandangoYacht(double speed, String color, double price, String mainSailColor) {
        super(speed, color, price, mainSailColor);
    }


    @Override
    public void floatOnWater() {
        System.out.println("The Fandango Yacht is floating gracefully on water.");
    }

}
