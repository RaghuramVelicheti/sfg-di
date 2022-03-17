package com.raghu.sfgdi.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.raghu.sfgdi.controllers.ConstructorBasedController;
import com.raghu.sfgdi.controllers.MyController;
import com.raghu.sfgdi.controllers.PropertyBasedController;
import com.raghu.sfgdi.controllers.SetterBasedController;
import com.raghu.sfgdi.controllers.i18NController;

@SpringBootApplication(scanBasePackages = {"com.raghu.sfgdi.*"})
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		System.out.println("-------------- ProfileBased");
		i18NController i18NController = ctx.getBean("i18NController",i18NController.class);
		System.out.println(i18NController.sayHello());
		
		System.out.println("-------------- PrimaryBased");
		MyController controller = ctx.getBean("myController",MyController.class);
		System.out.println(controller.sayHello());
		
		System.out.println("-------------- PropertyBased");
		PropertyBasedController propertyController = ctx.getBean("propertyBasedController",PropertyBasedController.class);
		System.out.println(propertyController.sayHello());
		
		System.out.println("-------------- SetterBased");
		SetterBasedController setterBasedController = ctx.getBean("setterBasedController",SetterBasedController.class);
		System.out.println(setterBasedController.sayHello());
		
		System.out.println("-------------- ConstructorBased");
		ConstructorBasedController constructorBasedInjection = ctx.getBean("constructorBasedController",ConstructorBasedController.class);
		System.out.println(constructorBasedInjection.sayHello());
	}

}
