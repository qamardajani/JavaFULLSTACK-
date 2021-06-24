package phone;


	public class IPhone extends Phone implements Ringable {
	    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
	        super(versionNumber, batteryPercentage, carrier, ringTone);
	    }
	    @Override
	    public String ring() {
	    	return this.getRingTone();
	    }
	    @Override
	    public String unlock() {
	        // your code here
	    	return "face print";
	    }
	    @Override
	    public void displayInfo() {
	        // your code here  
	 System.out.println("iphone"+ this.getVersionNumber()+"from" + this.getCarrier()); 
	 
	    }
	}


