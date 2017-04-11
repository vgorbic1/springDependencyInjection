package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import parts.EngineLarge;
import vehicles.Truck;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Truck aTruck = (Truck) context.getBean("bigTruck");
		aTruck.moveTruck();
	}

}
