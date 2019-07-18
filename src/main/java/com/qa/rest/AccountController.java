package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.qa.service.AccountService;

@Path("/account")
public class AccountController {

	@Inject
	private AccountService service;

	@GET
	@Path("/getAll")
	public String getAllAccounts() {
		return this.service.getAllAccounts();
	}

}
