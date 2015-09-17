package human;

public class Formal extends Man{

	
	
	public Formal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Formal(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String hello(Man man) {
		// TODO Auto-generated method stub
		return "Barev dzez "+man.getName();
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return "My name is "+name+ ", I am "+age+ ", I am from Belarus";
	}

	@Override
	public String toString() {
		return "Formal [name=" + name + ", age=" + age + "]"+" I am Formal";
	}
	
	

}
