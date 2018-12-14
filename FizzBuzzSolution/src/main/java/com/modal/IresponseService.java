package com.modal;

import org.springframework.stereotype.Service;

@Service
public interface IresponseService {
		public FizzBuzzResponse getResponse(FizzBuzzNumber numberList);
}
