
public class SibiuCarFactory extends CarFactory {

	@Override
	public Car produceCarModel(String model) {

		Car car = null;
		
		if (model == "Audi A1"){
			car = new AudiA1();
			car.setPrice(4000);
		} else if (model == "Audi A2"){
			car = new AudiA2();
			car.setPrice(5800);
		} else if (model == "Audi A4"){
			car = new AudiA4();
			car.setPrice(7950);
		}	
		return car;
	}
}