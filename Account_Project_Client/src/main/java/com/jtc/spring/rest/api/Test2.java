	package com.jtc.spring.rest.api;

import org.springframework.web.client.RestTemplate;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("Test2 Main");
		RestTemplate restTemp= new RestTemplate();
		String URL="http://localhost:12345/myaccount/8";
		Account acc=restTemp.getForObject(URL, Account.class);
		System.out.println(acc);
		System.out.println("Done");
	}

}
