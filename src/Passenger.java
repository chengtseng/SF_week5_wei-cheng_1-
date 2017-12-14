
public abstract class Passenger {
	public final static double fareRate = 0.5;	
	protected int newsPaper;	
	protected int numberOfMealsProvided;
	protected Type type;
	protected boolean hasFRC;
	
	public abstract double calculateCost();
	
	public Type getType() {
		return type;
	}

	public int getNumOfNewsPaper() {
		return newsPaper;
	}
	
	public void orderNewsPaper() {
		newsPaper++;
	}
	
	public int getNumberOfMealsProvided() {
		return numberOfMealsProvided;
	}
	
	public boolean getFRC() {
		return hasFRC;
	}
}
