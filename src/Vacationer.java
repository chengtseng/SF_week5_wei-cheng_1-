
public class Vacationer extends Passenger{
	
	private boolean meal;
	private int mileTravel;
	

	public Vacationer(int miles) throws IllegalArgumentException {
		meal = true;
		mileTravel = miles;
		if(miles < 5 || miles > 4000) throw new IllegalArgumentException("Out of bound");
		
		numberOfMealsProvided = miles / 100;
		if(miles / 100 > 0 && miles % 100 != 0) numberOfMealsProvided += 1;
		type = Type.VACATIONER;
	}

	public int getMileTravel() {
		return mileTravel;
	}	
	
	@Override
	public double calculateCost() {		
		return fareRate * mileTravel;
	}
	
	
}
