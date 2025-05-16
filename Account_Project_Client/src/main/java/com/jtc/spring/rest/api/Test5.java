package com.jtc.spring.rest.api;

import org.springframework.web.client.RestTemplate;

public class Test5 {
	public static void main(String[] args) {
		RestTemplate restTemp= new RestTemplate();
		String URL="http://localhost:12345/deleteAccount/8";
		restTemp.delete(URL);
		System.out.println("Done!!!");
	}

}
