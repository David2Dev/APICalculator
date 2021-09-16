package com.calculator.mathcalc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessCalc {
	
	@GetMapping("/add/{num1}/{num2}")
	public String mathAdd(@PathVariable Integer num1, @PathVariable Integer num2) {
		String message = "Add -" + (num1+num2);
		return message;
		
	}
	
	@GetMapping("/subtract/{num1}/{num2}")
	public String mathSubtract(@PathVariable Integer num1, @PathVariable Integer num2) {
		String message = "Subtract -" + (num1-num2);
		return message;
		
	}
	
	@GetMapping("/multiply/{num1}/{num2}")
	public String mathMultiply(@PathVariable Integer num1, @PathVariable Integer num2) {
		String message = "Multiply -" + (num1*num2);
		return message;
		
	}
	
	@GetMapping("/divide/{num1}/{num2}")
	public String mathDiv(@PathVariable Integer num1, @PathVariable Integer num2) {
		String message = "Divide -" + (num1/num2);
		return message;
		
	}

}
