public class Customer {

	public static void main(String[] args) {

		CarFactory sibiuCarFactory = new SibiuCarFactory();
		Car firstCustomerSibiu = sibiuCarFactory.buildCar("Audi A1");
		System.out.println("Price " + firstCustomerSibiu.getPrice() + "Euro \n");

		Car secondCustomerSibiu = sibiuCarFactory.buildCar("Audi A2");
		System.out.println("Price " + secondCustomerSibiu.getPrice() + "Euro \n");
		
		Car thirdCustomerSibiu = sibiuCarFactory.buildCar("Audi A4");
		System.out.println("Price " + thirdCustomerSibiu.getPrice() + "Euro \n");
		
				
		CarFactory bucurestiCarFactory = new BucurestiCarFactory();
		Car firstCustomerBucuresti = bucurestiCarFactory.buildCar("Audi A2");
		System.out.println("Price " + firstCustomerBucuresti.getPrice() + "Euro \n");
		
		Car secondCustomerBucuresti = bucurestiCarFactory.buildCar("Audi A3");
		System.out.println("Price " + secondCustomerBucuresti.getPrice() + "Euro \n");
		
		Car thirdCustomerBucuresti = bucurestiCarFactory.buildCar("Audi A5");
		System.out.println("Price " + thirdCustomerBucuresti.getPrice() + "Euro \n");
	}
}