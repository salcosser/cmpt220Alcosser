//Sam Alcosser
//5-1-19
public class Manager1 implements Printable {
	public String name;
	public int id;
	
	
	public Manager1(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("this manager named "+ name + " with the ID number " + id + "."); //custom print statement
	}

}
