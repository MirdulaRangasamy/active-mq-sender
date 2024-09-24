/**
 * @Placed com.exterro.activemq.service
 */
package com.exterro.activemq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * @author MirdulaRangasamy
 *
 * @date 26 Aug 2024
 */
@Component
public class SendService {

	@Autowired
	private JmsTemplate jmsTemplate; 
	
	public void sendYouName(String name) {
		jmsTemplate.convertAndSend("youtube",name);
	}
	
	public void sendMeName(String name) {
		jmsTemplate.convertAndSend("metube",name);
	}
}
