package compmarket;

public class RAM {
private int pow;
private String model;

public RAM() {
	super();
	// TODO Auto-generated constructor stub
}
public RAM(int pow, String model) {
	super();
	this.pow = pow;
	this.model = model;
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


@Override
public String toString() {
	return "RAM [pow=" + pow + ", model=" + model + "]";
}


}
