package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-sample.xml");
		Car car = (Car)context.getBean("carbean");
		System.out.println(car.getMake()+" "+car.getVIN()+" "+car.getWheels());
		Bike bike = (Bike)context.getBean("bikebean");
		System.out.println(bike.getMake()+" "+bike.getVIN()+" "+bike.getWheels());
	}

}
