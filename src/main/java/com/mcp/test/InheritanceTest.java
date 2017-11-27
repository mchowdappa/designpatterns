

public class InheritanceTest {

	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.setName("Janshi");

		System.out.println(sc.getName());
	}

}

interface Super {
	
}

class SuperClass {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}

class SubClass extends SuperClass {
	
}