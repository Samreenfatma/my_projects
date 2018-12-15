/*
      File Name                 : ApplicationController.java
      Principal Author          : Samreen Fatma
      Module Name               : com.modal
      Description               : Modal class for fizz buzz number
      Version                   : 1.0
      Date(DD/MM/YYYY)          : 14/12/2018
      Description of change     : Initial version
 */
package com.modal;

import java.util.ArrayList;

public class FizzBuzzNumber {
	private ArrayList<String> numberList;

	public FizzBuzzNumber() {
	}

	public FizzBuzzNumber(ArrayList<String> numberList) {
		super();
		this.numberList = numberList;
	}

	public ArrayList<String> getNumberList() {
		return numberList;
	}

	public void setNumberList(ArrayList<String> numberList) {
		this.numberList = numberList;
	}

	@Override
	public String toString() {
		return " Numberlist [numberList=" + numberList + "]";
	}

}
