package mouse;

public abstract class Car {
protected String model;
protected int year;
protected int price;
protected int pow;

public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
	
public Car(){
	
}
	
	public Car(String model, int year, int price, int pow) {
		super();
		this.model = model;
		this.year = year;
		this.price = price;
		this.pow = pow;
	}
	
	
	
	
	
	protected abstract int pow();
}
