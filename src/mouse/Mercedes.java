package mouse;

public class Mercedes extends Car{

	

	public Mercedes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mercedes(String model, int year, int price, int pow) {
		super(model, year, price, pow);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int pow() {
		// TODO Auto-generated method stub
		return pow*2;
	}

}
