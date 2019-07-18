package com.qa;

import com.qa.persistence.repository.AccountDBRepository;

public class App {

	public static void main(String[] args) {
		AccountDBRepository adbr = new AccountDBRepository();
		System.out.println(adbr.getAllAccounts());
	}

}
