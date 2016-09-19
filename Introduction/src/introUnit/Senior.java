package introUnit;

public class Senior extends Student {

	private String internship;
	
	public Senior(String name,String internship) {
		super(name);
		//senior is a superclass of student
		this.internship = internship;
	}

	public void talk(){
		super.talk();//call the super method first
		System.out.println("... and I am a Senior!");
		System.out.println("I intern as a "+internship);
	}
}
