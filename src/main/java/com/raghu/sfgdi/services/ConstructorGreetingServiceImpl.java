/**
 * Created by Raghu on 16-Mar-2022
 */
package com.raghu.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Raghu
 *
 */
@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

	/** 
	* Created by Raghu on 16-Mar-2022
	*/
	@Override
	public String sayGreetings() {
		
		return "Constructor Greeting Service !!!!";
	}

}
