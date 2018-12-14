/*
      File Name                 : ApplicationController.java
      Principal Author          : Samreen Fatma
      Module Name               : com.controller
      Description               : Main controller file of Spring MVC project
      Version                   : 1.0
      Date(DD/MM/YYYY)          : 14/12/2018
      Description of change     : Initial version
 */
package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.modal.FizzBuzzNumber;
import com.modal.IresponseService;
import com.modal.FizzBuzzResponse;

/**
 * Handling requests and sending response
 */
@Controller
@ComponentScan("com.modal")
public class ApplicationController {

	@Autowired
	public IresponseService responseService;

	/**
	 * @return string
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welocome() {
		return "index";
	}

	/**
	 * @param number or number list
	 * @return list of fizz buzz numbers
	 */
	@RequestMapping(value = "/getFizzBuzzResult/{number}")
	@ResponseBody
	public ResponseEntity<ArrayList<String>> getfizzBuzzNumber(
			@PathVariable("number") ArrayList<String> number) {
		FizzBuzzNumber fizzNumberList = new FizzBuzzNumber();
		fizzNumberList.setNumberList(number);
		FizzBuzzResponse response = responseService.getResponse(fizzNumberList);
		return ResponseEntity.accepted().body(response.getFizzBuzzList());
	}
}
