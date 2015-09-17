package human;

public abstract class Man {
protected String name;
protected int age;


public Man(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}


public Man() {
	super();
	// TODO Auto-generated constructor stub
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


@Override
public String toString() {
	return "Man [name=" + name + ", age=" + age + "]";
}

public abstract String hello(Man man);
public abstract String speak();

}
