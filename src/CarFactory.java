
public abstract class CarFactory {

	public abstract Car produceCarModel(String model);

	public Car buildCar(String model) {

		Car car = produceCarModel(model);
		car.carBuildingSteps();

		return car;
	}
}