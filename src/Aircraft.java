
public class Aircraft implements java.io.Serializable {

	private String name;
	private String model;
	
	private int capacity;

	
	public Aircraft(String name, String model, int capacity) {
		super();
		this.name = name;
		this.model = model;
		this.capacity = capacity;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	
}