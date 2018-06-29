

public class BucurestiCarFactory extends CarFactory {

	@Override
	public Car produceCarModel(String model) {
		
		Car car = null;
		
		if (model == "Audi A3"){
			car = new AudiA3();
			car.setPrice(3500);
		} else if (model == "Audi A2"){
			car = new AudiA2();
			car.setPrice(4500);
		} else if (model == "Audi A5"){
			car = new AudiA5();
			car.setPrice(6500);
		}	
		
		return car;
	}

}
