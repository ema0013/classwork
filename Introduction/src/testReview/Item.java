package testReview;

public class Item {
	
	private String description;
	private boolean purchased;
	
	public Item(String d) {
		this.description = d;
		this.purchased = false;
	}
	
	public void setPurchased(boolean b){
		this.purchased = b;
	}

	public boolean isPurchased() {
		return purchased;
	}

	public String getDescription() {
		return description;
	}
	
	/**
	 * code doesn't have to work, but it has to satisfy the rubric
	 * constructors aren't void
	 * 	 
	 * */

}
