package mouse;

public class BMW extends Car{

	

	public BMW() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BMW(String model, int year, int price, int pow) {
		super(model, year, price, pow);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int pow() {
		// TODO Auto-generated method stub
		return pow*4;
	}

}
