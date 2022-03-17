/**
 * Created by Raghu on 16-Mar-2022
 */
package com.raghu.sfgdi.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.raghu.sfgdi.controllers.MyController;
import com.raghu.sfgdi.services.ConstructorGreetingServiceImpl;
import com.raghu.sfgdi.services.GreetingService;

/**
 * @author Raghu
 *
 */
class MyControllerTest {
	
	private GreetingService greetingService;
	
	@BeforeEach
	void setUp() throws Exception {
		//greetingService = new FieldGreetingServiceImpl();
		//MyController controller = new MyController(new ConstructorGreetingServiceImpl());
	}

	/**
	 * Test method for {@link com.raghu.sfgdi.controllers.MyController#sayHello()}.
	 */
	@Test
	void testSayHello() {
	System.out.println(greetingService.sayGreetings());
	}

}
