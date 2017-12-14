

public class Commutor extends Passenger{
	private int stops;
	
	private boolean meal;
	
	
	public Commutor(int stops, boolean hasFRC) {
		this.stops = stops;
		this.hasFRC = hasFRC;
		meal = false;
		type = Type.COMMUTER;
		this.numberOfMealsProvided = 0;
	}

	@Override
	public double calculateCost() {		
		double cost = stops * fareRate;
		return hasFRC ? cost * 0.9 : cost;
	}

	public int getStops() {
		return stops;
	}

}
