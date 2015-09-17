package compmarket;

public class HDD {
private int pow;
private String model;



public HDD() {
	super();
	// TODO Auto-generated constructor stub
}
public HDD(int pow, String model) {
	super();
	this.pow = pow;
	this.model = model;
}
@Override
public String toString() {
	return "HDD [pow=" + pow + ", model=" + model + "]";
}
public int getPow() {
	return pow;
}
public void setPow(int pow) {
	this.pow = pow;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}



}
