/**
 * Created by Raghu on 17-Mar-2022
 */
package com.raghu.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Raghu
 *
 */
@Service
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {

	/** 
	* Created by Raghu on 17-Mar-2022
	*/
	@Override
	public String sayGreetings() {
		
		return "Hello Folks!!!!! from Primary Greeting Service";
	}

}
