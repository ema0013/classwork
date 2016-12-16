package stuff;

public class Sleeper implements Runnable{

	private int number;
	private int sleepTime;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Sleeper(int number) {
		this.number = number;
		this.sleepTime = (int)(1000*Math.random());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
