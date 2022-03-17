/**
 * Created by Raghu on 16-Mar-2022
 */
package com.raghu.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.raghu.sfgdi.services.GreetingService;

/**
 * @author Raghu
 *
 */
@Controller
public class ConstructorBasedController {
	
	private GreetingService greetingService;

	/**
	 * Created by Raghu on 16-Mar-2022
	 * @param greetingService
	 */
	
	public ConstructorBasedController(@Qualifier("constructorGreetingServiceImpl")GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		System.out.println("Hello World!!!");
		return greetingService.sayGreetings();
	}
	
	

}
