package vehicles;

import parts.Engine;

public class Truck {

	private Engine engine;
	
	public Truck(Engine engine) {
		this.engine = engine;
	}
	
	public void moveTruck() {
		engine.startEngine();
		System.out.println("Truck moves ...");
	}
	
}
