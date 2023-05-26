
public class Main {
	 public static void main(String[] args) {
	        U2SpyPlane u2SpyPlane = new U2SpyPlane(900, "Black", 10000000, 80);
	        System.out.println("U2 Spy Plane");
	        System.out.println("Speed: " + u2SpyPlane.getSpeed() + " km/h");
	        System.out.println("Color: " + u2SpyPlane.getColor());
	        System.out.println("Price: $" + u2SpyPlane.getPrice());
	        System.out.println("Wingspan: " + u2SpyPlane.getWingspan() + " meters");
	        u2SpyPlane.fly();
	        u2SpyPlane.stop();
	    }
}
