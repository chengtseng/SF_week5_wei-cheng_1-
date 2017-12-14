import java.util.LinkedList;
import java.util.List;
enum Type{COMMUTER, VACATIONER}
public class Journey {
	public static void main(String[] args) throws IllegalArgumentException {
		Journey journey = new Journey();
		Passenger p1 = new Commutor(3, true);
		Passenger p2 = new Commutor(5, true);
		Passenger p3 = new Commutor(4, false);
		p3.orderNewsPaper();
		journey.addPeopleToJourney(p1);
		journey.addPeopleToJourney(p2);
		journey.addPeopleToJourney(p3);
		journey.info();
		
		
		Journey journey2 = new Journey();
		Passenger p4 = new Vacationer(90);
		Passenger p5 = new Vacationer(199);		
		p5.orderNewsPaper();
		journey2.addPeopleToJourney(p4);
		journey2.addPeopleToJourney(p5);
		
		journey2.info();		
	}
	
	private List<Passenger> list;
	
	public Journey() {
		list = new LinkedList<>();		
	}
	
	public void addPeopleToJourney(Passenger p) {
		list.add(p);
	} 
	
	public void info() {
		int totalNumOfPaper = 0;
		int totalNumOfMeal = 0;
		for(Passenger p : list) {
			totalNumOfPaper += p.getNumOfNewsPaper();
			totalNumOfMeal += p.getNumberOfMealsProvided();
			System.out.printf("%s with frequent rider card : %b, order %d news paper and %d meals, cost him/her %f dollars\n",
					p.getType(), p.getFRC(), p.getNumOfNewsPaper(), p.getNumberOfMealsProvided(), p.calculateCost());
		}
		
		System.out.printf("Total news paper : %d, Total meals : %d\n\n", totalNumOfPaper, totalNumOfMeal);
		
	}

}
