package parts;

public class EngineLarge implements Engine {
	
	private int hp;
	
	public EngineLarge(int hp) {
		this.hp = hp;
	}
	
	public void startEngine() {
		System.out.println("Large Engine of " + hp + " hp has been started ...");
	}

}
