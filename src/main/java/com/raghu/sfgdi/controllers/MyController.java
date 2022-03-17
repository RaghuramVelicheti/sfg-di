/**
 * Created by Raghu on 15-Mar-2022
 */
package com.raghu.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.raghu.sfgdi.services.GreetingService;
/**
 * @author Raghu
 *
 */
@Controller
public class MyController {

	@Autowired
	private GreetingService greetingService;

	public String sayHello() {
		System.out.println("Hello World!!!");
		return greetingService.sayGreetings();
	}
}