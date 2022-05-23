package Question3;

public class Car {
	private String model;
	private String companyName;
	private String Color;
	Engine engine=new Engine();
	
	Car(){};
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	
	public void setcompanyName(String companyName) {
		this.companyName=companyName;
	}
	public String getcompanyName() {
		return companyName;
	}
	public void setColor(String Color) {
		this.Color=Color;
	}
	public String getColor() {
		return Color;
	}
	
	
	}
