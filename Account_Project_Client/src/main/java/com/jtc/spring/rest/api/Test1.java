package com.jtc.spring.rest.api;

import org.springframework.web.client.RestTemplate;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("Test1 in Main");
		RestTemplate restTemp= new RestTemplate();
		String URL="http://localhost:12345/addAccount";
		Account acc=  new Account("SA","B-99", 75000, "noida");
		String msg=restTemp.postForObject(URL, acc, String.class);
		System.out.println(msg);
		System.out.println("Done");
	}

}
