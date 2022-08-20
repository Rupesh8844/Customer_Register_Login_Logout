package com.masai.service;

import com.masai.model.CurrentUserSession;
import com.masai.model.Customer;
import com.masai.model.CustomerDTO;

public interface CustomerLoginService {
	
	public Customer registerCustomer(Customer customer);

	public CurrentUserSession logIntoAccount(CustomerDTO customerDTO);
	
	public String logOutFromAccount(String key);
	
}
