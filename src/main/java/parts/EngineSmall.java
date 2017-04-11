package parts;

public class EngineSmall implements Engine {
	
	private int hp;
	
	public EngineSmall(int hp) {
		this.hp = hp;
	}
	
	public void startEngine() {
		System.out.println("Small Engine of " + hp + " hp has been started ...");
	}

}
