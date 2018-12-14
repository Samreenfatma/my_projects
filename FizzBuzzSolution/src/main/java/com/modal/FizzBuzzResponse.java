/*
 	File Name                 : ApplicationController.java
 	Principal Author          : Samreen Fatma
 	Module Name               : com.modal
 	Description               : Modal class for fizz buzz response
 	Version                   : 1.0
 	Date(DD/MM/YYYY)          : 14/12/2018
 	Description of change     : Initial version
 */
package com.modal;

import java.util.ArrayList;

public class FizzBuzzResponse {
	private ArrayList<String> fizzBuzzList;

	public FizzBuzzResponse() {
		super();
	}

	public ArrayList<String> getFizzBuzzList() {
		return fizzBuzzList;
	}

	public void setFizzBuzzList(ArrayList<String> fizzBuzzList) {
		this.fizzBuzzList = fizzBuzzList;
	}

	@Override
	public String toString() {
		return "Response [fizzBuzzList=" + fizzBuzzList + "]";
	}

}
