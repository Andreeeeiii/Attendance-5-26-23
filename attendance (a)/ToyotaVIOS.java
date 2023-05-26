
public class ToyotaVIOS extends Vehicle {
	 

		private String tireType;
	    
	    public void drive() {
	        System.out.println("Toyota VIOS is driving");
	    
	    }

	    public String getTireType() {
			return tireType;
		}
	    
	    public void setTireType(String tireType) {
	        this.tireType = tireType;
	    }
	    
	    
	    @Override
	    public void stop() {
	        System.out.println("Toyota VIOS stopped");
	    }
	}
