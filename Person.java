package object.oriented;

public class Person {
	//The private variables
	private String name;
    private String nameCity;
    private int age;  
    
    //Constructor instance with the given inputs
    Person(String name, String nameCity, int age) {
      this.name=name;
      this.nameCity=nameCity;
      this.age=age;
    }
 // The public getters and setters for the private instance variables.

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//return a name and name city and age
	@Override
	public String toString() {
		return "Name= " + name + ", City= " + nameCity + ", age= " + age + "";
	}
}
