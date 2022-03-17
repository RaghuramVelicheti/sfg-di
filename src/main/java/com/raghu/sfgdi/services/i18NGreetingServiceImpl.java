/**
 * Created by Raghu on 17-Mar-2022
 */
package com.raghu.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Raghu
 *
 */
@Service("i18nService")
@Profile("EN")
public class i18NGreetingServiceImpl implements GreetingService {

	/** 
	* Created by Raghu on 17-Mar-2022
	*/
	@Override
	public String sayGreetings() {
		// TODO Auto-generated method stub
		return "Hello World!!!! ------- EN";
	}

}
