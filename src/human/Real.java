package human;

public class Real extends Man{


	
	
	public Real() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Real(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String hello(Man man) {
		// TODO Auto-generated method stub
		if(age-man.getAge()<5)
		return "barev dzez "+man.getName();
		else return "Privet "+man.getName();
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return"My name is "+name+", I am "+age+", I am from Ukraina";
	}

	@Override
	public String toString() {
		return "Real [name=" + name + ", age=" + age + "]"+"I am Real";
	}
	
	

}
