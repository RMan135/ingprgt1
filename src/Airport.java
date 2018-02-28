import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Airport implements java.io.Serializable {
	
	private String name;
	
	private List<Hangar> hangars;
	private List<Runway> runways;
	
	
	public Airport(String name) {
		this.name = name;
		this.hangars = new ArrayList<Hangar>();
		this.runways = new ArrayList<Runway>();
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addHangar(Hangar hangar) {
		this.hangars.add(hangar);
	}
	
	public void addHangar(String name) {
		Hangar hangar = new Hangar(name);
		this.hangars.add(hangar);
	}
	
	public void addRunway(Runway runway) {
		this.runways.add(runway);
	}
	
	public void addRunway(String name) {
		Runway runway = new Runway(name);
		this.runways.add(runway);
	}
	
	public int removeHangar(String hangarName) {
		for(ListIterator<Hangar> it = hangars.listIterator(hangars.size()); it.hasPrevious();) {
			if(it.previous().getName().equals(hangarName)){
				it.remove();
				return 1;
			}
		}
		return 0;
	}
	
	public int removeRunway(String runwayName) {
		for(ListIterator<Runway> it = runways.listIterator(runways.size()); it.hasPrevious();) {
			if(it.previous().getName().equals(runwayName)){
				it.remove();
				return 1;
			}
		}
		return 0;
	}
	
	public void listHangars() {
		int index = 1;
		for(ListIterator<Hangar> it = hangars.listIterator(hangars.size()); it.hasPrevious();) {
			System.out.printf("%d. %s\n", index, it.previous().getName());
			index++;
		}
	}
	
	public void listRunways() {
		int index = 1;
		for(ListIterator<Runway> it = runways.listIterator(runways.size()); it.hasPrevious();) {
			System.out.printf("%d. %s\n", index, it.previous().getName());
			index++;
		}
	}
	
	
	public void populateAirport() {
		this.addHangar("H1");
		this.addHangar("H2");
		this.addHangar("H3");
		
		this.addRunway("R1");
		this.addRunway("R2");
	}
	
}