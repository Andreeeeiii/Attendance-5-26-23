
public class VehicleMain {
	
public static void main(String[] args) {
    	
        ToyotaVIOS toyotaVIOS = new ToyotaVIOS();
        toyotaVIOS.setSpeed(150);
        toyotaVIOS.setColor("Purple");
        toyotaVIOS.setPrice(30000.0);
        toyotaVIOS.setTireType("Radial");
        
        System.out.println("Speed: " + toyotaVIOS.getSpeed() + "\n" + "Color: " + toyotaVIOS.getColor() +
        		"\n" + "Price: " + toyotaVIOS.getPrice() + "\n" + "Tire Type: " + toyotaVIOS.getTireType() + "\n");
        
        toyotaVIOS.drive();
        toyotaVIOS.stop();
        
    }
}

