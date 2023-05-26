
public class Main3 {
	public static void main(String[] args) {
        
        FandangoYacht fandangoYacht = new FandangoYacht(30.5, "White", 1500000.0, "Blue");

        
        System.out.println("Fandango Yacht Details:");
        System.out.println("Speed: " + fandangoYacht.speed);
        System.out.println("Color: " + fandangoYacht.color);
        System.out.println("Price: $" + fandangoYacht.price);
        System.out.println("Main Sail Color: " + fandangoYacht.mainSailColor);

        fandangoYacht.floatOnWater();
        fandangoYacht.stop();
    }
}
