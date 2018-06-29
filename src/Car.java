
public abstract class Car {
	public double price;
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public final void carBuildingSteps() {	     	      	      	      	         
		build();
		register();
		sale();
	    }

	public abstract void build();

	public abstract void register();

	public abstract void sale();
}