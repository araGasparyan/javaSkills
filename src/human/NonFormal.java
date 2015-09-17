package human;

public class NonFormal extends Man{

	
	
	public NonFormal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NonFormal(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String hello(Man man) {
		return "Bari or "+man.getName();
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return "My name is "+name+", I am "+age+", I am from Russia";
	}

	@Override
	public String toString() {
		return "NonFormal [name=" + name + ", age=" + age + "]" + "I am NonFormal";
	}

	
	
	

}
