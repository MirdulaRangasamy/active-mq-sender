/**
 * @Placed com.exterro.activemq.controller
 */
package com.exterro.activemq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exterro.activemq.service.SendService;

/**
 * @author MirdulaRangasamy
 *
 * @date 26 Aug 2024
 */
@RestController
public class SendController {

	@Autowired
	private SendService sendSvc;
	
	@GetMapping("/sendYoutube/{name}")
	public String sendYouName(@PathVariable String name) {
		sendSvc.sendYouName(name);
		return name;
	}
	
	@GetMapping("/sendMetube/{name}")
	public String sendMeName(@PathVariable String name) {
		sendSvc.sendMeName(name);
		return name;
	}
}
