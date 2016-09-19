package introUnit;

public class Junior extends Student {
		
	private String club;

	public Junior(String name,String club) {
		super(name);
		this.club = club;
	}
	
	public void talk(){
		super.talk();
		System.out.println("... and I am a Junior!");
		System.out.println("I am in the "+club+" club!");
	}

}
