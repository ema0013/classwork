package sort;

public class Pokemon {

	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	public Pokemon(String name, int level){
		this.name = name;
		this.level = level;
		this.poisoned = false;
		this.hp = 100;
	}

	public void iChooseYou(){
		System.out.println(getName());
		System.out.println(getName());
	}
	
	public int getHP(){
		return hp;
	}
	
	public String getName(){
		return name;
	}
	
	public void setHP(int newHP){
		this.hp = newHP;
	}
	
	public void setName(String newName){
		this.name = newName;
	}
	
	public void setPoisoned(boolean b){
		this.poisoned = b;
	}
	
	public void lapse(){
		if(poisoned){
			hp = hp-15;
		}
	}
}
