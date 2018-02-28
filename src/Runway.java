import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Runway implements java.io.Serializable {

	private String name;
	
	private int length;
	private int width;
	
	private List<Aircraft> aircraftList;
	
	public Runway(String name) {
		this.name = name;
		this.aircraftList = new ArrayList<Aircraft>();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void addAircraft(Aircraft aircraft) {
		this.aircraftList.add(aircraft);
	}
	
	public int removeAircraft(String aircraftName) {
		for(ListIterator<Aircraft> it = aircraftList.listIterator(aircraftList.size()); it.hasPrevious();) {
			if(it.previous().getName().equals(aircraftName)){
				it.remove();
				return 1;
			}
		}
		return 0;
	}
	
	public Aircraft getAircraft(String aircraftName) {
		for(ListIterator<Aircraft> it = aircraftList.listIterator(aircraftList.size()); it.hasPrevious();) {
			Aircraft a = it.previous();
			if(a.getName().equals(aircraftName)){
				return a;
			}
		}
		return null;
	}
	
	public void displayInfo() {
		System.out.printf(" === RUNWAY === \n"
				+ "Name: %s\n"
				+ "No. aircraft: %d\n", this.name, this.aircraftList.size());
		if(this.aircraftList.size() > 0)
		{
			for(ListIterator<Aircraft> it = aircraftList.listIterator(aircraftList.size()); it.hasPrevious();) {
				Aircraft a = it.previous();
				System.out.printf(" > %s [%s]\n", a.getName(), a.getModel());
			}
		}
		System.out.printf("\n");
	}
}
