/**
 * 
 */
package com.mm.sb.mmsbdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author USER
 *
 */

@RestController
public class DemoController {
	
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String showHello() {
		return "<h1>Hello User</h1>";
	}
	
	@GetMapping("/greet")
	public String showGreetMessage() {
		return "<h1>Good Morning</h1>";
	}

}
