package compmarket;

public class MotherBoard {
private String model;
private double p;



@Override
public String toString() {
	return "MotherBoard [model=" + model + ", p=" + p + "]";
}


public MotherBoard() {
	super();
	// TODO Auto-generated constructor stub
}


public MotherBoard(String model, double p) {
	super();
	this.model = model;
	this.p = p;
}


public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getP() {
	return p;
}
public void setP(double p) {
	this.p = p;
}

}
