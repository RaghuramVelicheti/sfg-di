/**
 * Created by Raghu on 17-Mar-2022
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
public class i18NController {

	private final GreetingService greetingService;

	public i18NController(@Qualifier("i18nService")GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreetings();
	}

}
