/**
 * 
 */
package com.ioc.xmlconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ashutosh Bane
 *
 */
public class SpringIocMainApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		ICar car = context.getBean("myCar", ICar.class);

		// call methods on the bean
		System.out.println(car.engineStart());

		// close the context
		context.close();

	}

}
