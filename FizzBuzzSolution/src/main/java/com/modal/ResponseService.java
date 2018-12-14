/*
      File Name                 : ApplicationController.java
      Principal Author          : Samreen Fatma
      Module Name               : com.modal
      Description               : Populate response of input number or list
      Version                   : 1.0
      Date(DD/MM/YYYY)          : 14/12/2018
      Description of change     : Initial version
 */
package com.modal;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

/**
 * Processing and validating the input numbers and sending response to the controller.
 */
@Component
public class ResponseService implements IresponseService {

	/**
	 * @param modal of fizz buzz number
	 * @return modal of fizz buzz response
	 */
	public FizzBuzzResponse getResponse(FizzBuzzNumber numberList) {
		String inputNumber;
		FizzBuzzResponse response = new FizzBuzzResponse();
		ArrayList<String> fizzBuzzResponse = new ArrayList<String>();
		for (String number : numberList.getNumberList()) {
			if (number.matches("[0-9]+")) {
				int fizzBuzzNumber = Integer.parseInt(number);
				if (fizzBuzzNumber % 15 == 0) {
					inputNumber = "fizzbuzz";
				} else if (fizzBuzzNumber % 3 == 0) {
					inputNumber = "fizz";
				} else if (fizzBuzzNumber % 5 == 0) {
					inputNumber = "buzz";
				} else {
					inputNumber = number;
				}

			} else {
				inputNumber = "Not a number";
			}
			fizzBuzzResponse.add(inputNumber);
		}
		response.setFizzBuzzList(fizzBuzzResponse);
		return response;
	}

}
